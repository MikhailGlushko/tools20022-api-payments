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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateAmendment5;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MandateAmendmentRequest message is sent by the initiator of the request
 * to his agent and/or counterparty. The initiator can both be the debtor or the
 * creditor (or where appropriate the debtor agent).<br>
 * The MandateAmendmentRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty.<br>
 * A MandateAmendmentRequest message is used to request the amendment of
 * specific information in an existing mandate. The MandateAmendmentRequest
 * message must reflect the new data of the element(s) to be amended and at a
 * minimum a unique reference to the existing mandate. If accepted, this
 * MandateAmendmentRequest message together with the MandateAcceptanceReport
 * message confirming the acceptance will be considered as a valid amendment on
 * an existing mandate, agreed upon by all parties. The amended mandate will
 * from then on be considered the valid mandate.<br>
 * <b>Usage</b><br>
 * The MandateAmendmentRequest message can contain one or more request(s) to
 * amend a specific mandate.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor.<br>
 * The MandateAmendmentRequest message can be used in domestic and cross-border
 * scenarios.<br>
 * If all elements in the existing Mandate need to be amended or the underlying
 * contract is different, then the MandateAmendmentRequest message should not be
 * used. The existing Mandate has to be cancelled and a new Mandate has to be
 * initiated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05#mmGroupHeader
 * MandateAmendmentRequestV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05#mmUnderlyingAmendmentDetails
 * MandateAmendmentRequestV05.mmUnderlyingAmendmentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05#mmSupplementaryData
 * MandateAmendmentRequestV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MndtAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
 * PaymentsInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.010.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAmendmentRequestV05
 * ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAmendmentRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateAmendmentRequest message is sent by the initiator of the request to his agent and/or counterparty. The initiator can both be the debtor or the creditor (or where appropriate the debtor agent).\r\nThe MandateAmendmentRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nA MandateAmendmentRequest message is used to request the amendment of specific information in an existing mandate. The MandateAmendmentRequest message must reflect the new data of the element(s) to be amended and at a minimum a unique reference to the existing mandate. If accepted, this MandateAmendmentRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered as a valid amendment on an existing mandate, agreed upon by all parties. The amended mandate will from then on be considered the valid mandate.\r\nUsage\r\nThe MandateAmendmentRequest message can contain one or more request(s) to amend a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateAmendmentRequest message can be used in domestic and cross-border scenarios.\r\nIf all elements in the existing Mandate need to be amended or the underlying contract is different, then the MandateAmendmentRequest message should not be used. The existing Mandate has to be cancelled and a new Mandate has to be initiated."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAmendmentRequestV05", propOrder = {"groupHeader", "underlyingAmendmentDetails", "supplementaryData"})
public class MandateAmendmentRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader47 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
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
	 * "Set of characteristics to identify the message and parties playing a role in the amendment of the mandate, but which are not part of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MandateAmendmentRequestV05, GroupHeader47> mmGroupHeader = new MMMessageBuildingBlock<MandateAmendmentRequestV05, GroupHeader47>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the amendment of the mandate, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}

		@Override
		public GroupHeader47 getValue(MandateAmendmentRequestV05 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(MandateAmendmentRequestV05 obj, GroupHeader47 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "UndrlygAmdmntDtls", required = true)
	protected List<MandateAmendment5> underlyingAmendmentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment5
	 * MandateAmendment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygAmdmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAmendmentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the amendment request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MandateAmendmentRequestV05, List<MandateAmendment5>> mmUnderlyingAmendmentDetails = new MMMessageBuildingBlock<MandateAmendmentRequestV05, List<MandateAmendment5>>() {
		{
			xmlTag = "UndrlygAmdmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingAmendmentDetails";
			definition = "Set of elements used to provide details on the amendment request.";
			minOccurs = 1;
			complexType_lazy = () -> MandateAmendment5.mmObject();
		}

		@Override
		public List<MandateAmendment5> getValue(MandateAmendmentRequestV05 obj) {
			return obj.getUnderlyingAmendmentDetails();
		}

		@Override
		public void setValue(MandateAmendmentRequestV05 obj, List<MandateAmendment5> value) {
			obj.setUnderlyingAmendmentDetails(value);
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
	public static final MMMessageBuildingBlock<MandateAmendmentRequestV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MandateAmendmentRequestV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MandateAmendmentRequestV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MandateAmendmentRequestV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAmendmentRequestV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAmendmentRequestV05";
				definition = "Scope\r\nThe MandateAmendmentRequest message is sent by the initiator of the request to his agent and/or counterparty. The initiator can both be the debtor or the creditor (or where appropriate the debtor agent).\r\nThe MandateAmendmentRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nA MandateAmendmentRequest message is used to request the amendment of specific information in an existing mandate. The MandateAmendmentRequest message must reflect the new data of the element(s) to be amended and at a minimum a unique reference to the existing mandate. If accepted, this MandateAmendmentRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered as a valid amendment on an existing mandate, agreed upon by all parties. The amended mandate will from then on be considered the valid mandate.\r\nUsage\r\nThe MandateAmendmentRequest message can contain one or more request(s) to amend a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateAmendmentRequest message can be used in domestic and cross-border scenarios.\r\nIf all elements in the existing Mandate need to be amended or the underlying contract is different, then the MandateAmendmentRequest message should not be used. The existing Mandate has to be cancelled and a new Mandate has to be initiated.";
				rootElement = "Document";
				xmlTag = "MndtAmdmntReq";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAmendmentRequestV05.mmGroupHeader, com.tools20022.repository.area.pain.MandateAmendmentRequestV05.mmUnderlyingAmendmentDetails,
						com.tools20022.repository.area.pain.MandateAmendmentRequestV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "010";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MandateAmendmentRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader47 getGroupHeader() {
		return groupHeader;
	}

	public MandateAmendmentRequestV05 setGroupHeader(GroupHeader47 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<MandateAmendment5> getUnderlyingAmendmentDetails() {
		return underlyingAmendmentDetails == null ? underlyingAmendmentDetails = new ArrayList<>() : underlyingAmendmentDetails;
	}

	public MandateAmendmentRequestV05 setUnderlyingAmendmentDetails(List<MandateAmendment5> underlyingAmendmentDetails) {
		this.underlyingAmendmentDetails = Objects.requireNonNull(underlyingAmendmentDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MandateAmendmentRequestV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.010.001.05")
	static public class Document {
		@XmlElement(name = "MndtAmdmntReq", required = true)
		public MandateAmendmentRequestV05 messageBody;
	}
}