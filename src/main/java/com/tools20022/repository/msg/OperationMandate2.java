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
import com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02;
import com.tools20022.repository.area.acmt.AccountOpeningRequestV02;
import com.tools20022.repository.choice.Channel2Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure4;
import com.tools20022.repository.msg.PartyAndAuthorisation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information specifying the Mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmIdentification
 * OperationMandate2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmApplicableChannel
 * OperationMandate2.mmApplicableChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmRequiredSignatureNumber
 * OperationMandate2.mmRequiredSignatureNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmSignatureOrderIndicator
 * OperationMandate2.mmSignatureOrderIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmMandateHolder
 * OperationMandate2.mmMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmBankOperation
 * OperationMandate2.mmBankOperation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate2#mmStartDate
 * OperationMandate2.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate2#mmEndDate
 * OperationMandate2.mmEndDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
 * CashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmMandate
 * AccountOpeningAmendmentRequestV02.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmMandate
 * AccountOpeningRequestV02.mmMandate}</li>
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
 * "OperationMandate2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information specifying the Mandate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OperationMandate3
 * OperationMandate3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OperationMandate2", propOrder = {"identification", "applicableChannel", "requiredSignatureNumber", "signatureOrderIndicator", "mandateHolder", "bankOperation", "startDate", "endDate"})
public class OperationMandate2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, Max35Text> mmIdentification = new MMMessageAttribute<OperationMandate2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OperationMandate2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(OperationMandate2 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AplblChanl", required = true)
	protected List<Channel2Choice> applicableChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Channel2Choice
	 * Channel2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Channel for which the operation mandate is valid. If ApplicableChannel equals Fax, this means that a bank operation instruction sent by fax will be processed according to the mandates exchanged in this message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, List<Channel2Choice>> mmApplicableChannel = new MMMessageAttribute<OperationMandate2, List<Channel2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "AplblChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableChannel";
			definition = "Channel for which the operation mandate is valid. If ApplicableChannel equals Fax, this means that a bank operation instruction sent by fax will be processed according to the mandates exchanged in this message.";
			minOccurs = 1;
			complexType_lazy = () -> Channel2Choice.mmObject();
		}

		@Override
		public List<Channel2Choice> getValue(OperationMandate2 obj) {
			return obj.getApplicableChannel();
		}

		@Override
		public void setValue(OperationMandate2 obj, List<Channel2Choice> value) {
			obj.setApplicableChannel(value);
		}
	};
	@XmlElement(name = "ReqrdSgntrNb", required = true)
	protected Max15PlusSignedNumericText requiredSignatureNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSgntrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatureNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of required and necessary signatures by the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, Max15PlusSignedNumericText> mmRequiredSignatureNumber = new MMMessageAttribute<OperationMandate2, Max15PlusSignedNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSgntrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSignatureNumber";
			definition = "Number of required and necessary signatures by the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}

		@Override
		public Max15PlusSignedNumericText getValue(OperationMandate2 obj) {
			return obj.getRequiredSignatureNumber();
		}

		@Override
		public void setValue(OperationMandate2 obj, Max15PlusSignedNumericText value) {
			obj.setRequiredSignatureNumber(value);
		}
	};
	@XmlElement(name = "SgntrOrdrInd", required = true)
	protected YesNoIndicator signatureOrderIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatureOrderIndicator
	 * SignatureCondition.mmSignatureOrderIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrOrdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureOrderIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator whether a certain order of signatures has to be respected or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, YesNoIndicator> mmSignatureOrderIndicator = new MMMessageAttribute<OperationMandate2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatureOrderIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "SgntrOrdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureOrderIndicator";
			definition = "Indicator whether a certain order of signatures has to be respected or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(OperationMandate2 obj) {
			return obj.getSignatureOrderIndicator();
		}

		@Override
		public void setValue(OperationMandate2 obj, YesNoIndicator value) {
			obj.setSignatureOrderIndicator(value);
		}
	};
	@XmlElement(name = "MndtHldr")
	protected List<PartyAndAuthorisation1> mandateHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
	 * PartyAndAuthorisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holder of the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OperationMandate2, List<PartyAndAuthorisation1>> mmMandateHolder = new MMMessageAssociationEnd<OperationMandate2, List<PartyAndAuthorisation1>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "MndtHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateHolder";
			definition = "Holder of the mandate.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyAndAuthorisation1.mmObject();
		}

		@Override
		public List<PartyAndAuthorisation1> getValue(OperationMandate2 obj) {
			return obj.getMandateHolder();
		}

		@Override
		public void setValue(OperationMandate2 obj, List<PartyAndAuthorisation1> value) {
			obj.setMandateHolder(value);
		}
	};
	@XmlElement(name = "BkOpr", required = true)
	protected List<BankTransactionCodeStructure4> bankOperation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationType
	 * BankOperation.mmOperationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkOpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank operation allowed by a mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OperationMandate2, List<BankTransactionCodeStructure4>> mmBankOperation = new MMMessageAssociationEnd<OperationMandate2, List<BankTransactionCodeStructure4>>() {
		{
			businessElementTrace_lazy = () -> BankOperation.mmOperationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "BkOpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOperation";
			definition = "Bank operation allowed by a mandate.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public List<BankTransactionCodeStructure4> getValue(OperationMandate2 obj) {
			return obj.getBankOperation();
		}

		@Override
		public void setValue(OperationMandate2 obj, List<BankTransactionCodeStructure4> value) {
			obj.setBankOperation(value);
		}
	};
	@XmlElement(name = "StartDt")
	protected ISODate startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Is the date when the mandate becomes valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, Optional<ISODate>> mmStartDate = new MMMessageAttribute<OperationMandate2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Is the date when the mandate becomes valid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OperationMandate2 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(OperationMandate2 obj, Optional<ISODate> value) {
			obj.setStartDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EndDt")
	protected ISODate endDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2
	 * OperationMandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Is the date when the mandate stops to be valid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OperationMandate2, Optional<ISODate>> mmEndDate = new MMMessageAttribute<OperationMandate2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.OperationMandate2.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Is the date when the mandate stops to be valid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OperationMandate2 obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(OperationMandate2 obj, Optional<ISODate> value) {
			obj.setEndDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OperationMandate2.mmIdentification, com.tools20022.repository.msg.OperationMandate2.mmApplicableChannel,
						com.tools20022.repository.msg.OperationMandate2.mmRequiredSignatureNumber, com.tools20022.repository.msg.OperationMandate2.mmSignatureOrderIndicator, com.tools20022.repository.msg.OperationMandate2.mmMandateHolder,
						com.tools20022.repository.msg.OperationMandate2.mmBankOperation, com.tools20022.repository.msg.OperationMandate2.mmStartDate, com.tools20022.repository.msg.OperationMandate2.mmEndDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningAmendmentRequestV02.mmMandate, AccountOpeningRequestV02.mmMandate);
				trace_lazy = () -> CashAccountMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OperationMandate2";
				definition = "Information specifying the Mandate.";
				nextVersions_lazy = () -> Arrays.asList(OperationMandate3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public OperationMandate2 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<Channel2Choice> getApplicableChannel() {
		return applicableChannel == null ? applicableChannel = new ArrayList<>() : applicableChannel;
	}

	public OperationMandate2 setApplicableChannel(List<Channel2Choice> applicableChannel) {
		this.applicableChannel = Objects.requireNonNull(applicableChannel);
		return this;
	}

	public Max15PlusSignedNumericText getRequiredSignatureNumber() {
		return requiredSignatureNumber;
	}

	public OperationMandate2 setRequiredSignatureNumber(Max15PlusSignedNumericText requiredSignatureNumber) {
		this.requiredSignatureNumber = Objects.requireNonNull(requiredSignatureNumber);
		return this;
	}

	public YesNoIndicator getSignatureOrderIndicator() {
		return signatureOrderIndicator;
	}

	public OperationMandate2 setSignatureOrderIndicator(YesNoIndicator signatureOrderIndicator) {
		this.signatureOrderIndicator = Objects.requireNonNull(signatureOrderIndicator);
		return this;
	}

	public List<PartyAndAuthorisation1> getMandateHolder() {
		return mandateHolder == null ? mandateHolder = new ArrayList<>() : mandateHolder;
	}

	public OperationMandate2 setMandateHolder(List<PartyAndAuthorisation1> mandateHolder) {
		this.mandateHolder = Objects.requireNonNull(mandateHolder);
		return this;
	}

	public List<BankTransactionCodeStructure4> getBankOperation() {
		return bankOperation == null ? bankOperation = new ArrayList<>() : bankOperation;
	}

	public OperationMandate2 setBankOperation(List<BankTransactionCodeStructure4> bankOperation) {
		this.bankOperation = Objects.requireNonNull(bankOperation);
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public OperationMandate2 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<ISODate> getEndDate() {
		return endDate == null ? Optional.empty() : Optional.of(endDate);
	}

	public OperationMandate2 setEndDate(ISODate endDate) {
		this.endDate = endDate;
		return this;
	}
}