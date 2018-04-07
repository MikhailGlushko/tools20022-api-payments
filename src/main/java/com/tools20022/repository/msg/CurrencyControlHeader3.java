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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01;
import com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01;
import com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01;
import com.tools20022.repository.choice.Party28Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics shared by all individual items included in the currency
 * control message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3#mmMessageIdentification
 * CurrencyControlHeader3.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3#mmCreationDateTime
 * CurrencyControlHeader3.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3#mmNumberOfItems
 * CurrencyControlHeader3.mmNumberOfItems}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3#mmInitiatingParty
 * CurrencyControlHeader3.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3#mmForwardingAgent
 * CurrencyControlHeader3.mmForwardingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01#mmGroupHeader
 * CurrencyControlSupportingDocumentDeliveryV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01#mmGroupHeader
 * PaymentRegulatoryInformationNotificationV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01#mmGroupHeader
 * CurrencyControlRequestOrLetterV01.mmGroupHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyControlHeader3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics shared by all individual items included in the currency control message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyControlHeader3", propOrder = {"messageIdentification", "creationDateTime", "numberOfItems", "initiatingParty", "forwardingAgent"})
public class CurrencyControlHeader3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlHeader3, Max35Text> mmMessageIdentification = new MMMessageAttribute<CurrencyControlHeader3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlHeader3.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CurrencyControlHeader3 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(CurrencyControlHeader3 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlHeader3, ISODateTime> mmCreationDateTime = new MMMessageAttribute<CurrencyControlHeader3, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlHeader3.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CurrencyControlHeader3 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(CurrencyControlHeader3 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "NbOfItms", required = true)
	protected Max15NumericText numberOfItems;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfItms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of individual items contained in the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyControlHeader3, Max15NumericText> mmNumberOfItems = new MMMessageAttribute<CurrencyControlHeader3, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlHeader3.mmObject();
			isDerived = false;
			xmlTag = "NbOfItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfItems";
			definition = "Number of individual items contained in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(CurrencyControlHeader3 obj) {
			return obj.getNumberOfItems();
		}

		@Override
		public void setValue(CurrencyControlHeader3 obj, Max15NumericText value) {
			obj.setNumberOfItems(value);
		}
	};
	@XmlElement(name = "InitgPty", required = true)
	protected Party28Choice initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party28Choice
	 * Party28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyControlHeader3, Party28Choice> mmInitiatingParty = new MMMessageAssociationEnd<CurrencyControlHeader3, Party28Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlHeader3.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiates the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Party28Choice.mmObject();
		}

		@Override
		public Party28Choice getValue(CurrencyControlHeader3 obj) {
			return obj.getInitiatingParty();
		}

		@Override
		public void setValue(CurrencyControlHeader3 obj, Party28Choice value) {
			obj.setInitiatingParty(value);
		}
	};
	@XmlElement(name = "FwdgAgt")
	protected BranchAndFinancialInstitutionIdentification5 forwardingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader3
	 * CurrencyControlHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FwdgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent which forwards the message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyControlHeader3, Optional<BranchAndFinancialInstitutionIdentification5>> mmForwardingAgent = new MMMessageAssociationEnd<CurrencyControlHeader3, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyControlHeader3.mmObject();
			isDerived = false;
			xmlTag = "FwdgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardingAgent";
			definition = "Agent which forwards the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CurrencyControlHeader3 obj) {
			return obj.getForwardingAgent();
		}

		@Override
		public void setValue(CurrencyControlHeader3 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setForwardingAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyControlHeader3.mmMessageIdentification, com.tools20022.repository.msg.CurrencyControlHeader3.mmCreationDateTime,
						com.tools20022.repository.msg.CurrencyControlHeader3.mmNumberOfItems, com.tools20022.repository.msg.CurrencyControlHeader3.mmInitiatingParty, com.tools20022.repository.msg.CurrencyControlHeader3.mmForwardingAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(CurrencyControlSupportingDocumentDeliveryV01.mmGroupHeader, PaymentRegulatoryInformationNotificationV01.mmGroupHeader, CurrencyControlRequestOrLetterV01.mmGroupHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlHeader3";
				definition = "Characteristics shared by all individual items included in the currency control message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public CurrencyControlHeader3 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public CurrencyControlHeader3 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max15NumericText getNumberOfItems() {
		return numberOfItems;
	}

	public CurrencyControlHeader3 setNumberOfItems(Max15NumericText numberOfItems) {
		this.numberOfItems = Objects.requireNonNull(numberOfItems);
		return this;
	}

	public Party28Choice getInitiatingParty() {
		return initiatingParty;
	}

	public CurrencyControlHeader3 setInitiatingParty(Party28Choice initiatingParty) {
		this.initiatingParty = Objects.requireNonNull(initiatingParty);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getForwardingAgent() {
		return forwardingAgent == null ? Optional.empty() : Optional.of(forwardingAgent);
	}

	public CurrencyControlHeader3 setForwardingAgent(BranchAndFinancialInstitutionIdentification5 forwardingAgent) {
		this.forwardingAgent = forwardingAgent;
		return this;
	}
}