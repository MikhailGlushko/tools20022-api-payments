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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.GroupHeader60;
import com.tools20022.repository.msg.OriginalNotification9;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The NotificationToReceiveStatusReport message is sent by an account servicing
 * institution to an account owner or to a party acting on the account owner's
 * behalf. It is used to notify the account owner about the status of one or
 * more expected payments that were advised in a previous NotificationToReceive
 * message.<br>
 * <b>Usage</b><br>
 * The NotificationToReceiveStatusReport message is sent in response to a
 * NotificationToReceive message and can be used in either a direct or a relay
 * scenario. It is used to advise the account owner of receipt of the funds as
 * expected. It is also used to notify the account owner of non-receipt of funds
 * or of discrepancies in the funds received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05#mmGroupHeader
 * NotificationToReceiveStatusReportV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05#mmOriginalNotificationAndStatus
 * NotificationToReceiveStatusReportV05.mmOriginalNotificationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05#mmSupplementaryData
 * NotificationToReceiveStatusReportV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtfctnToRcvStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.059.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveStatusReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe NotificationToReceiveStatusReport message is sent by an account servicing institution to an account owner or to a party acting on the account owner's behalf. It is used to notify the account owner about the status of one or more expected payments that were advised in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveStatusReport message is sent in response to a NotificationToReceive message and can be used in either a direct or a relay scenario. It is used to advise the account owner of receipt of the funds as expected. It is also used to notify the account owner of non-receipt of funds or of discrepancies in the funds received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationToReceiveStatusReportV05", propOrder = {"groupHeader", "originalNotificationAndStatus", "supplementaryData"})
public class NotificationToReceiveStatusReportV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader60 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader60
	 * GroupHeader60}</li>
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
	 * "Set of elements used to provide further details on the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, GroupHeader60> mmGroupHeader = new MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, GroupHeader60>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of elements used to provide further details on the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader60.mmObject();
		}

		@Override
		public GroupHeader60 getValue(NotificationToReceiveStatusReportV05 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(NotificationToReceiveStatusReportV05 obj, GroupHeader60 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlNtfctnAndSts", required = true)
	protected OriginalNotification9 originalNotificationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9
	 * OriginalNotification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctnAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotificationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the original notification and to provide the status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, OriginalNotification9> mmOriginalNotificationAndStatus = new MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, OriginalNotification9>() {
		{
			xmlTag = "OrgnlNtfctnAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotificationAndStatus";
			definition = "Set of elements used to identify the original notification and to provide the status.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalNotification9.mmObject();
		}

		@Override
		public OriginalNotification9 getValue(NotificationToReceiveStatusReportV05 obj) {
			return obj.getOriginalNotificationAndStatus();
		}

		@Override
		public void setValue(NotificationToReceiveStatusReportV05 obj, OriginalNotification9 value) {
			obj.setOriginalNotificationAndStatus(value);
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
	public static final MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<NotificationToReceiveStatusReportV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(NotificationToReceiveStatusReportV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(NotificationToReceiveStatusReportV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveStatusReportV05";
				definition = "Scope\r\nThe NotificationToReceiveStatusReport message is sent by an account servicing institution to an account owner or to a party acting on the account owner's behalf. It is used to notify the account owner about the status of one or more expected payments that were advised in a previous NotificationToReceive message.\r\nUsage\r\nThe NotificationToReceiveStatusReport message is sent in response to a NotificationToReceive message and can be used in either a direct or a relay scenario. It is used to advise the account owner of receipt of the funds as expected. It is also used to notify the account owner of non-receipt of funds or of discrepancies in the funds received.";
				rootElement = "Document";
				xmlTag = "NtfctnToRcvStsRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05.mmGroupHeader,
						com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05.mmOriginalNotificationAndStatus, com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "059";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationToReceiveStatusReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader60 getGroupHeader() {
		return groupHeader;
	}

	public NotificationToReceiveStatusReportV05 setGroupHeader(GroupHeader60 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalNotification9 getOriginalNotificationAndStatus() {
		return originalNotificationAndStatus;
	}

	public NotificationToReceiveStatusReportV05 setOriginalNotificationAndStatus(OriginalNotification9 originalNotificationAndStatus) {
		this.originalNotificationAndStatus = Objects.requireNonNull(originalNotificationAndStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public NotificationToReceiveStatusReportV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.05")
	static public class Document {
		@XmlElement(name = "NtfctnToRcvStsRpt", required = true)
		public NotificationToReceiveStatusReportV05 messageBody;
	}
}