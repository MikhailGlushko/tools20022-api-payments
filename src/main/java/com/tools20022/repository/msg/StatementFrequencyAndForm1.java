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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CommunicationFormat1Choice;
import com.tools20022.repository.choice.CommunicationMethod2Choice;
import com.tools20022.repository.codeset.Frequency7Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a frequency, format and delivery address for statements.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFrequency
 * StatementFrequencyAndForm1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmCommunicationMethod
 * StatementFrequencyAndForm1.mmCommunicationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmDeliveryAddress
 * StatementFrequencyAndForm1.mmDeliveryAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFormat
 * StatementFrequencyAndForm1.mmFormat}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ReportingService
 * ReportingService}</li>
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
 * "StatementFrequencyAndForm1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a frequency, format and delivery address for statements."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementFrequencyAndForm1", propOrder = {"frequency", "communicationMethod", "deliveryAddress", "format"})
public class StatementFrequencyAndForm1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency7Code frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency7Code
	 * Frequency7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the frequency for sending statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementFrequencyAndForm1, Frequency7Code> mmFrequency = new MMMessageAttribute<StatementFrequencyAndForm1, Frequency7Code>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Specifies the frequency for sending statements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Frequency7Code.mmObject();
		}

		@Override
		public Frequency7Code getValue(StatementFrequencyAndForm1 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(StatementFrequencyAndForm1 obj, Frequency7Code value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "ComMtd", required = true)
	protected CommunicationMethod2Choice communicationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod2Choice
	 * CommunicationMethod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
	 * ReportingService.mmReportingChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the communication method for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementFrequencyAndForm1, CommunicationMethod2Choice> mmCommunicationMethod = new MMMessageAttribute<StatementFrequencyAndForm1, CommunicationMethod2Choice>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmReportingChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "ComMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationMethod";
			definition = "Specifies the communication method for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CommunicationMethod2Choice.mmObject();
		}

		@Override
		public CommunicationMethod2Choice getValue(StatementFrequencyAndForm1 obj) {
			return obj.getCommunicationMethod();
		}

		@Override
		public void setValue(StatementFrequencyAndForm1 obj, CommunicationMethod2Choice value) {
			obj.setCommunicationMethod(value);
		}
	};
	@XmlElement(name = "DlvryAdr", required = true)
	protected Max350Text deliveryAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery address for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementFrequencyAndForm1, Max350Text> mmDeliveryAddress = new MMMessageAttribute<StatementFrequencyAndForm1, Max350Text>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "DlvryAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAddress";
			definition = "Specifies the delivery address for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(StatementFrequencyAndForm1 obj) {
			return obj.getDeliveryAddress();
		}

		@Override
		public void setValue(StatementFrequencyAndForm1 obj, Max350Text value) {
			obj.setDeliveryAddress(value);
		}
	};
	@XmlElement(name = "Frmt", required = true)
	protected CommunicationFormat1Choice format;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationFormat1Choice
	 * CommunicationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the format for statements."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatementFrequencyAndForm1, CommunicationFormat1Choice> mmFormat = new MMMessageAttribute<StatementFrequencyAndForm1, CommunicationFormat1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndForm1.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Specifies the format for statements.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CommunicationFormat1Choice.mmObject();
		}

		@Override
		public CommunicationFormat1Choice getValue(StatementFrequencyAndForm1 obj) {
			return obj.getFormat();
		}

		@Override
		public void setValue(StatementFrequencyAndForm1 obj, CommunicationFormat1Choice value) {
			obj.setFormat(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementFrequencyAndForm1.mmFrequency, com.tools20022.repository.msg.StatementFrequencyAndForm1.mmCommunicationMethod,
						com.tools20022.repository.msg.StatementFrequencyAndForm1.mmDeliveryAddress, com.tools20022.repository.msg.StatementFrequencyAndForm1.mmFormat);
				trace_lazy = () -> ReportingService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementFrequencyAndForm1";
				definition = "Specifies a frequency, format and delivery address for statements.";
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency7Code getFrequency() {
		return frequency;
	}

	public StatementFrequencyAndForm1 setFrequency(Frequency7Code frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public CommunicationMethod2Choice getCommunicationMethod() {
		return communicationMethod;
	}

	public StatementFrequencyAndForm1 setCommunicationMethod(CommunicationMethod2Choice communicationMethod) {
		this.communicationMethod = Objects.requireNonNull(communicationMethod);
		return this;
	}

	public Max350Text getDeliveryAddress() {
		return deliveryAddress;
	}

	public StatementFrequencyAndForm1 setDeliveryAddress(Max350Text deliveryAddress) {
		this.deliveryAddress = Objects.requireNonNull(deliveryAddress);
		return this;
	}

	public CommunicationFormat1Choice getFormat() {
		return format;
	}

	public StatementFrequencyAndForm1 setFormat(CommunicationFormat1Choice format) {
		this.format = Objects.requireNonNull(format);
		return this;
	}
}