/*************************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                              *
 * This program is free software; you can redistribute it and/or modify it    		 *
 * under the terms version 2 or later of the GNU General Public License as published *
 * by the Free Software Foundation. This program is distributed in the hope   		 *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied 		 *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           		 *
 * See the GNU General Public License for more details.                       		 *
 * You should have received a copy of the GNU General Public License along    		 *
 * with this program; if not, write to the Free Software Foundation, Inc.,    		 *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     		 *
 * For the text or an alternative of this public license, you may reach us    		 *
 * Copyright (C) 2012-2018 E.R.P. Consultores y Asociados, S.A. All Rights Reserved. *
 * Contributor(s): Yamel Senih www.erpya.com				  		                 *
 *************************************************************************************/
package org.spin.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MDocType;
import org.compiere.util.Env;

/**
 * @author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 */
public class CalloutRecordWeight extends CalloutEngine {

	/**
	 * Set Is SO Tr
	 * @param ctx
	 * @param WindowNo
	 * @param mTab
	 * @param mField
	 * @param value
	 * @return
	 * @return String
	 */
	public String documentType (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		Integer m_C_DocType_ID = (Integer)value;
		if (m_C_DocType_ID == null || m_C_DocType_ID.intValue() == 0)
			return "";
		
		MDocType documentType = MDocType.get(ctx, m_C_DocType_ID.intValue());
		//	Is SO Trx
		mTab.setValue("IsSOTrx", documentType.isSOTrx());
		return "";
	}
	
	/**
	 * Set Net Weight and Time (in/out)
	 * @param ctx
	 * @param WindowNo
	 * @param mTab
	 * @param mField
	 * @param value
	 * @return
	 * @return String
	 */
	public String weight (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		BigDecimal tareWeight = (BigDecimal) (mTab.getValue("TareWeight") != null
				? mTab.getValue("TareWeight")
				: Env.ZERO);
	    BigDecimal grossWeight = (BigDecimal) (mTab.getValue("GrossWeight") != null
	    		? mTab.getValue("GrossWeight")
	    		: Env.ZERO);
	    BigDecimal netWeight = grossWeight.subtract(tareWeight);
	    //	Set Net Weight
	    mTab.setValue("NetWeight",netWeight);

	    boolean isSOTrx = mTab.getValueAsBoolean("IsSOTrx");
	    
	    Timestamp today = new Timestamp(System.currentTimeMillis());  
	    //	Set Day
	    if(!isSOTrx){
	    	if(mField.getColumnName().equals("TareWeight")
	    			&& !tareWeight.equals(Env.ZERO)){
	    		mTab.setValue("OutDate", today);
	    	}else if(mField.getColumnName().equals("GrossWeight")
	    			&& !grossWeight.equals(Env.ZERO)){
	    		mTab.setValue("InDate", today);
	    	}
	    	//	Valid Weight Status
	    	if(grossWeight.equals(Env.ZERO))
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_WaitingForGrossWeight);
	    	else if(tareWeight.equals(Env.ZERO))
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_WaitingForTareWeight);
	    	else
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_Completed);	    	
	    } else{
	    	if(mField.getColumnName().equals("TareWeight")
	    			&& !tareWeight.equals(Env.ZERO)){
	    		mTab.setValue("InDate", today);
	    	}else if(mField.getColumnName().equals("GrossWeight")
	    			&& !grossWeight.equals(Env.ZERO)){
	    		mTab.setValue("OutDate", today);
	    	}
	    	//	Valid Weight Status
	    	if(tareWeight.equals(Env.ZERO))
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_WaitingForTareWeight);
	    	else if(grossWeight.equals(Env.ZERO))
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_WaitingForGrossWeight);
	    	else
	    		mTab.setValue("WeightStatus", X_DD_RecordWeight.WEIGHTSTATUS_Completed);
	    }    

		return "";
	}
}
