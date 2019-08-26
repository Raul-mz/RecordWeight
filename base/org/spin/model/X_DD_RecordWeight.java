/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.spin.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for DD_RecordWeight
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_DD_RecordWeight extends PO implements I_DD_RecordWeight, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190826L;

    /** Standard Constructor */
    public X_DD_RecordWeight (Properties ctx, int DD_RecordWeight_ID, String trxName)
    {
      super (ctx, DD_RecordWeight_ID, trxName);
      /** if (DD_RecordWeight_ID == 0)
        {
			setC_DocType_ID (0);
			setDateDoc (new Timestamp( System.currentTimeMillis() ));
// @#Date@
			setDD_RecordWeight_ID (0);
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setGrossWeight (Env.ZERO);
			setIsApproved (false);
// N
			setIsSOTrx (false);
// N
			setNetWeight (Env.ZERO);
			setProcessed (false);
			setProcessing (false);
// N
			setTareWeight (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_DD_RecordWeight (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_DD_RecordWeight[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_Value (COLUMNNAME_C_Order_ID, null);
		else 
			set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException
    {
		return (org.compiere.model.I_C_OrderLine)MTable.get(getCtx(), org.compiere.model.I_C_OrderLine.Table_Name)
			.getPO(getC_OrderLine_ID(), get_TrxName());	}

	/** Set Sales Order Line.
		@param C_OrderLine_ID 
		Sales Order Line
	  */
	public void setC_OrderLine_ID (int C_OrderLine_ID)
	{
		if (C_OrderLine_ID < 1) 
			set_Value (COLUMNNAME_C_OrderLine_ID, null);
		else 
			set_Value (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
	}

	/** Get Sales Order Line.
		@return Sales Order Line
	  */
	public int getC_OrderLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
    {
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_Name)
			.getPO(getC_UOM_ID(), get_TrxName());	}

	/** Set UOM.
		@param C_UOM_ID 
		Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else 
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	public org.eevolution.model.I_DD_Driver getDD_Driver() throws RuntimeException
    {
		return (org.eevolution.model.I_DD_Driver)MTable.get(getCtx(), org.eevolution.model.I_DD_Driver.Table_Name)
			.getPO(getDD_Driver_ID(), get_TrxName());	}

	/** Set Driver.
		@param DD_Driver_ID Driver	  */
	public void setDD_Driver_ID (int DD_Driver_ID)
	{
		if (DD_Driver_ID < 1) 
			set_Value (COLUMNNAME_DD_Driver_ID, null);
		else 
			set_Value (COLUMNNAME_DD_Driver_ID, Integer.valueOf(DD_Driver_ID));
	}

	/** Get Driver.
		@return Driver	  */
	public int getDD_Driver_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DD_Driver_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_DD_Freight getDD_Freight() throws RuntimeException
    {
		return (org.eevolution.model.I_DD_Freight)MTable.get(getCtx(), org.eevolution.model.I_DD_Freight.Table_Name)
			.getPO(getDD_Freight_ID(), get_TrxName());	}

	/** Set Order Freight ID.
		@param DD_Freight_ID Order Freight ID	  */
	public void setDD_Freight_ID (int DD_Freight_ID)
	{
		if (DD_Freight_ID < 1) 
			set_Value (COLUMNNAME_DD_Freight_ID, null);
		else 
			set_Value (COLUMNNAME_DD_Freight_ID, Integer.valueOf(DD_Freight_ID));
	}

	/** Get Order Freight ID.
		@return Order Freight ID	  */
	public int getDD_Freight_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DD_Freight_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Record Weight.
		@param DD_RecordWeight_ID Record Weight	  */
	public void setDD_RecordWeight_ID (int DD_RecordWeight_ID)
	{
		if (DD_RecordWeight_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DD_RecordWeight_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DD_RecordWeight_ID, Integer.valueOf(DD_RecordWeight_ID));
	}

	/** Get Record Weight.
		@return Record Weight	  */
	public int getDD_RecordWeight_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DD_RecordWeight_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_DD_Vehicle getDD_Vehicle() throws RuntimeException
    {
		return (org.eevolution.model.I_DD_Vehicle)MTable.get(getCtx(), org.eevolution.model.I_DD_Vehicle.Table_Name)
			.getPO(getDD_Vehicle_ID(), get_TrxName());	}

	/** Set Vehicle.
		@param DD_Vehicle_ID Vehicle	  */
	public void setDD_Vehicle_ID (int DD_Vehicle_ID)
	{
		if (DD_Vehicle_ID < 1) 
			set_Value (COLUMNNAME_DD_Vehicle_ID, null);
		else 
			set_Value (COLUMNNAME_DD_Vehicle_ID, Integer.valueOf(DD_Vehicle_ID));
	}

	/** Get Vehicle.
		@return Vehicle	  */
	public int getDD_Vehicle_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DD_Vehicle_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Get Weight (From Scale).
		@param GetWeightFromScale 
		Get Weight from a external device like Scale
	  */
	public void setGetWeightFromScale (String GetWeightFromScale)
	{
		set_Value (COLUMNNAME_GetWeightFromScale, GetWeightFromScale);
	}

	/** Get Get Weight (From Scale).
		@return Get Weight from a external device like Scale
	  */
	public String getGetWeightFromScale () 
	{
		return (String)get_Value(COLUMNNAME_GetWeightFromScale);
	}

	/** Set Gross Weight.
		@param GrossWeight Gross Weight	  */
	public void setGrossWeight (BigDecimal GrossWeight)
	{
		set_Value (COLUMNNAME_GrossWeight, GrossWeight);
	}

	/** Get Gross Weight.
		@return Gross Weight	  */
	public BigDecimal getGrossWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrossWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set In Date.
		@param InDate In Date	  */
	public void setInDate (Timestamp InDate)
	{
		set_Value (COLUMNNAME_InDate, InDate);
	}

	/** Get In Date.
		@return In Date	  */
	public Timestamp getInDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_InDate);
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Printed.
		@param IsPrinted 
		Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted)
	{
		set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
	}

	/** Get Printed.
		@return Indicates if this document / line is printed
	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_IsPrinted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Reference Weight.
		@param IsReferenceWeight 
		Describe a Reference Weight
	  */
	public void setIsReferenceWeight (boolean IsReferenceWeight)
	{
		set_ValueNoCheck (COLUMNNAME_IsReferenceWeight, Boolean.valueOf(IsReferenceWeight));
	}

	/** Get Reference Weight.
		@return Describe a Reference Weight
	  */
	public boolean isReferenceWeight () 
	{
		Object oo = get_Value(COLUMNNAME_IsReferenceWeight);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sales Transaction.
		@param IsSOTrx 
		This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx)
	{
		set_ValueNoCheck (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
	}

	/** Get Sales Transaction.
		@return This is a Sales Transaction
	  */
	public boolean isSOTrx () 
	{
		Object oo = get_Value(COLUMNNAME_IsSOTrx);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Maximum Weight.
		@param MaximumWeight Maximum Weight	  */
	public void setMaximumWeight (BigDecimal MaximumWeight)
	{
		set_Value (COLUMNNAME_MaximumWeight, MaximumWeight);
	}

	/** Get Maximum Weight.
		@return Maximum Weight	  */
	public BigDecimal getMaximumWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MaximumWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Minimum Weight.
		@param MinimumWeight 
		Minimum Weight of a product
	  */
	public void setMinimumWeight (BigDecimal MinimumWeight)
	{
		set_Value (COLUMNNAME_MinimumWeight, MinimumWeight);
	}

	/** Get Minimum Weight.
		@return Minimum Weight of a product
	  */
	public BigDecimal getMinimumWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinimumWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException
    {
		return (org.compiere.model.I_M_Shipper)MTable.get(getCtx(), org.compiere.model.I_M_Shipper.Table_Name)
			.getPO(getM_Shipper_ID(), get_TrxName());	}

	/** Set Shipper.
		@param M_Shipper_ID 
		Method or manner of product delivery
	  */
	public void setM_Shipper_ID (int M_Shipper_ID)
	{
		if (M_Shipper_ID < 1) 
			set_Value (COLUMNNAME_M_Shipper_ID, null);
		else 
			set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
	}

	/** Get Shipper.
		@return Method or manner of product delivery
	  */
	public int getM_Shipper_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Net Weight.
		@param NetWeight Net Weight	  */
	public void setNetWeight (BigDecimal NetWeight)
	{
		set_Value (COLUMNNAME_NetWeight, NetWeight);
	}

	/** Get Net Weight.
		@return Net Weight	  */
	public BigDecimal getNetWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NetWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Out Date.
		@param OutDate Out Date	  */
	public void setOutDate (Timestamp OutDate)
	{
		set_Value (COLUMNNAME_OutDate, OutDate);
	}

	/** Get Out Date.
		@return Out Date	  */
	public Timestamp getOutDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_OutDate);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Reference No.
		@param ReferenceNo 
		Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo)
	{
		set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo () 
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** Set Tare Weight.
		@param TareWeight Tare Weight	  */
	public void setTareWeight (BigDecimal TareWeight)
	{
		set_Value (COLUMNNAME_TareWeight, TareWeight);
	}

	/** Get Tare Weight.
		@return Tare Weight	  */
	public BigDecimal getTareWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TareWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set Weight Registered.
		@param WeightRegistered 
		Weight Registered from Scale
	  */
	public void setWeightRegistered (BigDecimal WeightRegistered)
	{
		set_Value (COLUMNNAME_WeightRegistered, WeightRegistered);
	}

	/** Get Weight Registered.
		@return Weight Registered from Scale
	  */
	public BigDecimal getWeightRegistered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WeightRegistered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** WeightStatus AD_Reference_ID=54156 */
	public static final int WEIGHTSTATUS_AD_Reference_ID=54156;
	/** Waiting For Tare Weight = T */
	public static final String WEIGHTSTATUS_WaitingForTareWeight = "T";
	/** Waiting For Gross Weight = G */
	public static final String WEIGHTSTATUS_WaitingForGrossWeight = "G";
	/** Completed = C */
	public static final String WEIGHTSTATUS_Completed = "C";
	/** Set Weight Status.
		@param WeightStatus 
		Weight Status registered
	  */
	public void setWeightStatus (String WeightStatus)
	{

		set_Value (COLUMNNAME_WeightStatus, WeightStatus);
	}

	/** Get Weight Status.
		@return Weight Status registered
	  */
	public String getWeightStatus () 
	{
		return (String)get_Value(COLUMNNAME_WeightStatus);
	}
}