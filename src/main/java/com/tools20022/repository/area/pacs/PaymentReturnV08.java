/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.GroupHeader72;
import com.tools20022.repository.msg.OriginalGroupHeader12;
import com.tools20022.repository.msg.PaymentTransaction87;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The PaymentReturn message is sent by an agent to the previous agent in the
 * payment chain to undo a payment previously settled.<br>
 * <b>Usage</b><br>
 * The PaymentReturn message is exchanged between agents to return funds after
 * settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer
 * message and FinancialInstitutionCreditTransfer message) or direct debit
 * instructions (FIToFICustomerDirectDebit message).<br>
 * The PaymentReturn message should not be used between agents and non-financial
 * institution customers. Non-financial institution customers will be informed
 * about a debit or a credit on their account(s) through a
 * BankToCustomerDebitCreditNotification message ('notification') and/or
 * BankToCustomerAccountReport/BankToCustomerStatement message ('statement').<br>
 * The PaymentReturn message can be used to return single instructions or
 * multiple instructions from one or different files.<br>
 * The PaymentReturn message can be used in domestic and cross-border scenarios.<br>
 * The PaymentReturn message refers to the original instruction(s) by means of
 * references only or by means of references and a set of elements from the
 * original instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08#mmGroupHeader
 * PaymentReturnV08.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08#mmOriginalGroupInformation
 * PaymentReturnV08.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08#mmTransactionInformation
 * PaymentReturnV08.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08#mmSupplementaryData
 * PaymentReturnV08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PmtRtr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.004.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_PaymentReturnV08
 * ConstraintInstructedAgentRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_PaymentReturnV08
 * ConstraintInstructingAgentRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule#for_pacs_PaymentReturnV08
 * ConstraintGroupReturnAndNumberOfTransactionsRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule#for_pacs_PaymentReturnV08
 * ConstraintGroupReturnAndReturnReasonRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#for_pacs_PaymentReturnV08
 * ConstraintTotalReturnedInterbankSettlementAmountRule.
 * for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule#for_pacs_PaymentReturnV08
 * ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.
 * for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule#for_pacs_PaymentReturnV08
 * ConstraintOriginalGroupInformationRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#for_pacs_PaymentReturnV08
 * ConstraintNoCoverSettlementMethodRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_PaymentReturnV08
 * ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#for_pacs_PaymentReturnV08
 * ConstraintTransactionInterbankSettlementDateRule.for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule#for_pacs_PaymentReturnV08
 * ConstraintGroupReturnAndTransactionInformationNotPresentRule.
 * for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule#for_pacs_PaymentReturnV08
 * ConstraintGroupReturnAndTransactionInformationPresentRule.
 * for_pacs_PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_PaymentReturnV08
 * ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnV08", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class PaymentReturnV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader72 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader72
	 * GroupHeader72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PaymentReturnV08, GroupHeader72> mmGroupHeader = new MMMessageBuildingBlock<PaymentReturnV08, GroupHeader72>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader72.mmObject();
		}

		@Override
		public GroupHeader72 getValue(PaymentReturnV08 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(PaymentReturnV08 obj, GroupHeader72 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupHeader12 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader12
	 * OriginalGroupHeader12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PaymentReturnV08, Optional<OriginalGroupHeader12>> mmOriginalGroupInformation = new MMMessageBuildingBlock<PaymentReturnV08, Optional<OriginalGroupHeader12>>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader12.mmObject();
		}

		@Override
		public Optional<OriginalGroupHeader12> getValue(PaymentReturnV08 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(PaymentReturnV08 obj, Optional<OriginalGroupHeader12> value) {
			obj.setOriginalGroupInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction87> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87
	 * PaymentTransaction87}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transactions, to which the return message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PaymentReturnV08, List<PaymentTransaction87>> mmTransactionInformation = new MMMessageBuildingBlock<PaymentReturnV08, List<PaymentTransaction87>>() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the return message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction87.mmObject();
		}

		@Override
		public List<PaymentTransaction87> getValue(PaymentReturnV08 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(PaymentReturnV08 obj, List<PaymentTransaction87> value) {
			obj.setTransactionInformation(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PaymentReturnV08, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<PaymentReturnV08, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(PaymentReturnV08 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(PaymentReturnV08 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_PaymentReturnV08, com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule.for_pacs_PaymentReturnV08, com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule.for_pacs_PaymentReturnV08,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_PaymentReturnV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnV08";
				definition = "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.";
				rootElement = "Document";
				xmlTag = "PmtRtr";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentReturnV08.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentReturnV08.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.PaymentReturnV08.mmTransactionInformation, com.tools20022.repository.area.pacs.PaymentReturnV08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "004";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentReturnV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader72 getGroupHeader() {
		return groupHeader;
	}

	public PaymentReturnV08 setGroupHeader(GroupHeader72 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public Optional<OriginalGroupHeader12> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentReturnV08 setOriginalGroupInformation(OriginalGroupHeader12 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public List<PaymentTransaction87> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public PaymentReturnV08 setTransactionInformation(List<PaymentTransaction87> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PaymentReturnV08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.08")
	static public class Document {
		@XmlElement(name = "PmtRtr", required = true)
		public PaymentReturnV08 messageBody;
	}
}