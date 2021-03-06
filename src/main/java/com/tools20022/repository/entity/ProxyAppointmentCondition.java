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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Conditions that must be met to appoint a proxy.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProxyAppointmentCondition"
 * src="doc-files/ProxyAppointmentCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmNotificationAddress
 * ProxyAppointmentCondition.mmNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
 * ProxyAppointmentCondition.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmRegistrationMethod
 * ProxyAppointmentCondition.mmRegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmAllowedProxyType
 * ProxyAppointmentCondition.mmAllowedProxyType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedProxyAppointment
 * ContactPoint.mmRelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
 * Meeting.mmProxyAppointmentConditions}</li>
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
 * "ProxyAppointmentCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Conditions that must be met to appoint a proxy."</li>
 * </ul>
 */
public class ProxyAppointmentCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ContactPoint notificationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedProxyAppointment
	 * ContactPoint.mmRelatedProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the information on the proxy should be sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ProxyAppointmentCondition, ContactPoint> mmNotificationAddress = new MMBusinessAssociationEnd<ProxyAppointmentCondition, ContactPoint>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ContactPoint.mmRelatedProxyAppointment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public ContactPoint getValue(ProxyAppointmentCondition obj) {
			return obj.getNotificationAddress();
		}

		@Override
		public void setValue(ProxyAppointmentCondition obj, ContactPoint value) {
			obj.setNotificationAddress(value);
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meeting to which the proxy appointment conditions aplly."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ProxyAppointmentCondition, Optional<Meeting>> mmMeeting = new MMBusinessAssociationEnd<ProxyAppointmentCondition, Optional<Meeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Specifies the meeting to which the proxy appointment conditions aplly.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Meeting.mmProxyAppointmentConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public Optional<Meeting> getValue(ProxyAppointmentCondition obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(ProxyAppointmentCondition obj, Optional<Meeting> value) {
			obj.setMeeting(value.orElse(null));
		}
	};
	protected Max350Text registrationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProxyAppointmentCondition, Max350Text> mmRegistrationMethod = new MMBusinessAttribute<ProxyAppointmentCondition, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(ProxyAppointmentCondition obj) {
			return obj.getRegistrationMethod();
		}

		@Override
		public void setValue(ProxyAppointmentCondition obj, Max350Text value) {
			obj.setRegistrationMethod(value);
		}
	};
	protected ProxyTypeCode allowedProxyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who can be assigned as a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProxyAppointmentCondition, ProxyTypeCode> mmAllowedProxyType = new MMBusinessAttribute<ProxyAppointmentCondition, ProxyTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProxyAppointmentCondition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowedProxyType";
			definition = "Specifies who can be assigned as a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}

		@Override
		public ProxyTypeCode getValue(ProxyAppointmentCondition obj) {
			return obj.getAllowedProxyType();
		}

		@Override
		public void setValue(ProxyAppointmentCondition obj, ProxyTypeCode value) {
			obj.setAllowedProxyType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentCondition";
				definition = "Conditions that must be met to appoint a proxy.";
				associationDomain_lazy = () -> Arrays.asList(ContactPoint.mmRelatedProxyAppointment, Meeting.mmProxyAppointmentConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointmentCondition.mmNotificationAddress, com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting,
						com.tools20022.repository.entity.ProxyAppointmentCondition.mmRegistrationMethod, com.tools20022.repository.entity.ProxyAppointmentCondition.mmAllowedProxyType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProxyAppointmentCondition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ContactPoint getNotificationAddress() {
		return notificationAddress;
	}

	public ProxyAppointmentCondition setNotificationAddress(ContactPoint notificationAddress) {
		this.notificationAddress = Objects.requireNonNull(notificationAddress);
		return this;
	}

	public Optional<Meeting> getMeeting() {
		return meeting == null ? Optional.empty() : Optional.of(meeting);
	}

	public ProxyAppointmentCondition setMeeting(Meeting meeting) {
		this.meeting = meeting;
		return this;
	}

	public Max350Text getRegistrationMethod() {
		return registrationMethod;
	}

	public ProxyAppointmentCondition setRegistrationMethod(Max350Text registrationMethod) {
		this.registrationMethod = Objects.requireNonNull(registrationMethod);
		return this;
	}

	public ProxyTypeCode getAllowedProxyType() {
		return allowedProxyType;
	}

	public ProxyAppointmentCondition setAllowedProxyType(ProxyTypeCode allowedProxyType) {
		this.allowedProxyType = Objects.requireNonNull(allowedProxyType);
		return this;
	}
}