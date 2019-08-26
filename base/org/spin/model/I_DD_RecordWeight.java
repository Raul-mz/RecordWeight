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
package org.spin.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for DD_RecordWeight
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_DD_RecordWeight 
{

    /** TableName=DD_RecordWeight */
    public static final String Table_Name = "DD_RecordWeight";

    /** AD_Table_ID=54660 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_Order_ID */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

	/** Set Order.
	  * Order
	  */
	public void setC_Order_ID (int C_Order_ID);

	/** Get Order.
	  * Order
	  */
	public int getC_Order_ID();

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException;

    /** Column name C_OrderLine_ID */
    public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";

	/** Set Sales Order Line.
	  * Sales Order Line
	  */
	public void setC_OrderLine_ID (int C_OrderLine_ID);

	/** Get Sales Order Line.
	  * Sales Order Line
	  */
	public int getC_OrderLine_ID();

	public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name DD_Driver_ID */
    public static final String COLUMNNAME_DD_Driver_ID = "DD_Driver_ID";

	/** Set Driver	  */
	public void setDD_Driver_ID (int DD_Driver_ID);

	/** Get Driver	  */
	public int getDD_Driver_ID();

	public org.eevolution.model.I_DD_Driver getDD_Driver() throws RuntimeException;

    /** Column name DD_Freight_ID */
    public static final String COLUMNNAME_DD_Freight_ID = "DD_Freight_ID";

	/** Set Order Freight ID	  */
	public void setDD_Freight_ID (int DD_Freight_ID);

	/** Get Order Freight ID	  */
	public int getDD_Freight_ID();

	public org.eevolution.model.I_DD_Freight getDD_Freight() throws RuntimeException;

    /** Column name DD_RecordWeight_ID */
    public static final String COLUMNNAME_DD_RecordWeight_ID = "DD_RecordWeight_ID";

	/** Set Record Weight	  */
	public void setDD_RecordWeight_ID (int DD_RecordWeight_ID);

	/** Get Record Weight	  */
	public int getDD_RecordWeight_ID();

    /** Column name DD_Vehicle_ID */
    public static final String COLUMNNAME_DD_Vehicle_ID = "DD_Vehicle_ID";

	/** Set Vehicle	  */
	public void setDD_Vehicle_ID (int DD_Vehicle_ID);

	/** Get Vehicle	  */
	public int getDD_Vehicle_ID();

	public org.eevolution.model.I_DD_Vehicle getDD_Vehicle() throws RuntimeException;

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name GetWeightFromScale */
    public static final String COLUMNNAME_GetWeightFromScale = "GetWeightFromScale";

	/** Set Get Weight (From Scale).
	  * Get Weight from a external device like Scale
	  */
	public void setGetWeightFromScale (String GetWeightFromScale);

	/** Get Get Weight (From Scale).
	  * Get Weight from a external device like Scale
	  */
	public String getGetWeightFromScale();

    /** Column name GrossWeight */
    public static final String COLUMNNAME_GrossWeight = "GrossWeight";

	/** Set Gross Weight	  */
	public void setGrossWeight (BigDecimal GrossWeight);

	/** Get Gross Weight	  */
	public BigDecimal getGrossWeight();

    /** Column name InDate */
    public static final String COLUMNNAME_InDate = "InDate";

	/** Set In Date	  */
	public void setInDate (Timestamp InDate);

	/** Get In Date	  */
	public Timestamp getInDate();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name IsPrinted */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";

	/** Set Printed.
	  * Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted);

	/** Get Printed.
	  * Indicates if this document / line is printed
	  */
	public boolean isPrinted();

    /** Column name IsReferenceWeight */
    public static final String COLUMNNAME_IsReferenceWeight = "IsReferenceWeight";

	/** Set Reference Weight.
	  * Describe a Reference Weight
	  */
	public void setIsReferenceWeight (boolean IsReferenceWeight);

	/** Get Reference Weight.
	  * Describe a Reference Weight
	  */
	public boolean isReferenceWeight();

    /** Column name IsSOTrx */
    public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/** Set Sales Transaction.
	  * This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx);

	/** Get Sales Transaction.
	  * This is a Sales Transaction
	  */
	public boolean isSOTrx();

    /** Column name MaximumWeight */
    public static final String COLUMNNAME_MaximumWeight = "MaximumWeight";

	/** Set Maximum Weight	  */
	public void setMaximumWeight (BigDecimal MaximumWeight);

	/** Get Maximum Weight	  */
	public BigDecimal getMaximumWeight();

    /** Column name MinimumWeight */
    public static final String COLUMNNAME_MinimumWeight = "MinimumWeight";

	/** Set Minimum Weight.
	  * Minimum Weight of a product
	  */
	public void setMinimumWeight (BigDecimal MinimumWeight);

	/** Get Minimum Weight.
	  * Minimum Weight of a product
	  */
	public BigDecimal getMinimumWeight();

    /** Column name M_Shipper_ID */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

	/** Set Shipper.
	  * Method or manner of product delivery
	  */
	public void setM_Shipper_ID (int M_Shipper_ID);

	/** Get Shipper.
	  * Method or manner of product delivery
	  */
	public int getM_Shipper_ID();

	public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /** Column name NetWeight */
    public static final String COLUMNNAME_NetWeight = "NetWeight";

	/** Set Net Weight	  */
	public void setNetWeight (BigDecimal NetWeight);

	/** Get Net Weight	  */
	public BigDecimal getNetWeight();

    /** Column name OutDate */
    public static final String COLUMNNAME_OutDate = "OutDate";

	/** Set Out Date	  */
	public void setOutDate (Timestamp OutDate);

	/** Get Out Date	  */
	public Timestamp getOutDate();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo();

    /** Column name TareWeight */
    public static final String COLUMNNAME_TareWeight = "TareWeight";

	/** Set Tare Weight	  */
	public void setTareWeight (BigDecimal TareWeight);

	/** Get Tare Weight	  */
	public BigDecimal getTareWeight();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name WeightRegistered */
    public static final String COLUMNNAME_WeightRegistered = "WeightRegistered";

	/** Set Weight Registered.
	  * Weight Registered from Scale
	  */
	public void setWeightRegistered (BigDecimal WeightRegistered);

	/** Get Weight Registered.
	  * Weight Registered from Scale
	  */
	public BigDecimal getWeightRegistered();

    /** Column name WeightStatus */
    public static final String COLUMNNAME_WeightStatus = "WeightStatus";

	/** Set Weight Status.
	  * Weight Status registered
	  */
	public void setWeightStatus (String WeightStatus);

	/** Get Weight Status.
	  * Weight Status registered
	  */
	public String getWeightStatus();
}
