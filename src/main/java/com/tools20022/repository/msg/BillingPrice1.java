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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.BillingChargeMethod1Code;
import com.tools20022.repository.datatype.Max20Text;
import com.tools20022.repository.entity.CashAccountService;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the billing price of a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmCurrency
 * BillingPrice1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmUnitPrice
 * BillingPrice1.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmMethod
 * BillingPrice1.mmMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmRule
 * BillingPrice1.mmRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
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
 * "BillingPrice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the billing price of a service."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingPrice1", propOrder = {"currency", "unitPrice", "method", "rule"})
public class BillingPrice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmCurrency
	 * Price.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency code in which the unit price and original charge price are expressed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingPrice1, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<BillingPrice1, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Price.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingPrice1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency code in which the unit price and original charge price are expressed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(BillingPrice1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(BillingPrice1 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitPric")
	protected AmountAndDirection34 unitPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price per item or unit used to calculate the charge expressed in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BillingPrice1, Optional<AmountAndDirection34>> mmUnitPrice = new MMMessageAssociationEnd<BillingPrice1, Optional<AmountAndDirection34>>() {
		{
			businessComponentTrace_lazy = () -> Price.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingPrice1.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Price per item or unit used to calculate the charge expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingPrice1 obj) {
			return obj.getUnitPrice();
		}

		@Override
		public void setValue(BillingPrice1 obj, Optional<AmountAndDirection34> value) {
			obj.setUnitPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Mtd")
	protected BillingChargeMethod1Code method;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethod1Code
	 * BillingChargeMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingChargeMethod
	 * CashAccountService.mmBillingChargeMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies how the charge was calculated. \n\nUsage: The absence of this code assumes that the charge is calculated as the product of (volume x unit price)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingPrice1, Optional<BillingChargeMethod1Code>> mmMethod = new MMMessageAttribute<BillingPrice1, Optional<BillingChargeMethod1Code>>() {
		{
			businessElementTrace_lazy = () -> CashAccountService.mmBillingChargeMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingPrice1.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Identifies how the charge was calculated. \n\nUsage: The absence of this code assumes that the charge is calculated as the product of (volume x unit price).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BillingChargeMethod1Code.mmObject();
		}

		@Override
		public Optional<BillingChargeMethod1Code> getValue(BillingPrice1 obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(BillingPrice1 obj, Optional<BillingChargeMethod1Code> value) {
			obj.setMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "Rule")
	protected Max20Text rule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max20Text
	 * Max20Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the charge calculation is based on a particular rule. The rule name is carried here and is defined by the trading partners."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BillingPrice1, Optional<Max20Text>> mmRule = new MMMessageAttribute<BillingPrice1, Optional<Max20Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingPrice1.mmObject();
			isDerived = false;
			xmlTag = "Rule";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rule";
			definition = "Indicates that the charge calculation is based on a particular rule. The rule name is carried here and is defined by the trading partners.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20Text.mmObject();
		}

		@Override
		public Optional<Max20Text> getValue(BillingPrice1 obj) {
			return obj.getRule();
		}

		@Override
		public void setValue(BillingPrice1 obj, Optional<Max20Text> value) {
			obj.setRule(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingPrice1.mmCurrency, com.tools20022.repository.msg.BillingPrice1.mmUnitPrice, com.tools20022.repository.msg.BillingPrice1.mmMethod,
						com.tools20022.repository.msg.BillingPrice1.mmRule);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingPrice1";
				definition = "Specifies the billing price of a service.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public BillingPrice1 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AmountAndDirection34> getUnitPrice() {
		return unitPrice == null ? Optional.empty() : Optional.of(unitPrice);
	}

	public BillingPrice1 setUnitPrice(AmountAndDirection34 unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public Optional<BillingChargeMethod1Code> getMethod() {
		return method == null ? Optional.empty() : Optional.of(method);
	}

	public BillingPrice1 setMethod(BillingChargeMethod1Code method) {
		this.method = method;
		return this;
	}

	public Optional<Max20Text> getRule() {
		return rule == null ? Optional.empty() : Optional.of(rule);
	}

	public BillingPrice1 setRule(Max20Text rule) {
		this.rule = rule;
		return this;
	}
}