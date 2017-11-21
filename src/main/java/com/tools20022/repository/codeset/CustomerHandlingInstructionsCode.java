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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Codes that apply special information that the Broker / Dealer needs to
 * report, as specified by the customer. Firms that are taking in orders
 * manually but routing for execution electronically and for compliance
 * reporting must capture the client's handling instructions.This is intended
 * for reporting only ( OATS = Order Audit Trail System - Phase III regulatory
 * requirement).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmFillOrKill
 * CustomerHandlingInstructionsCode.mmFillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmImmediateOrCancel
 * CustomerHandlingInstructionsCode.mmImmediateOrCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmAllOrNone
 * CustomerHandlingInstructionsCode.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmScale
 * CustomerHandlingInstructionsCode.mmScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmWork
 * CustomerHandlingInstructionsCode.mmWork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmAddOnOrder
 * CustomerHandlingInstructionsCode.mmAddOnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmExchangeForPhysicalTransaction
 * CustomerHandlingInstructionsCode.mmExchangeForPhysicalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmImbalanceOnly
 * CustomerHandlingInstructionsCode.mmImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmPegged
 * CustomerHandlingInstructionsCode.mmPegged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode#mmNotHeld
 * CustomerHandlingInstructionsCode.mmNotHeld}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIKI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerHandlingInstructionsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Firms that are taking in orders manually but routing for execution electronically and for compliance reporting must capture the client's handling instructions.This is intended for reporting only ( OATS =  Order Audit Trail System - Phase III regulatory requirement)."
 * </li>
 * </ul>
 */
public class CustomerHandlingInstructionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Market or limit order that is to be executed in its entirety as soon as
	 * it is submitted; if not so executed, the order is to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIKI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFillOrKill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			definition = "Market or limit order that is to be executed in its entirety as soon as it is submitted; if not so executed, the order is to be cancelled.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "FIKI";
		}
	};
	/**
	 * Market or limit order to be executed in whole or in part as soon as it is
	 * submitted; any portion not so executed is to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmImmediateOrCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			definition = "Market or limit order to be executed in whole or in part as soon as it is submitted; any portion not so executed is to be cancelled.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "IOCA";
		}
	};
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, All Or None orders
	 * are not treated as canceled if they are not executed as soon as
	 * represented in the Trading Crowd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, All Or None orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAllOrNone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, All Or None orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "ALON";
		}
	};
	/**
	 * Order to buy (or sell) a financial instrument which specifies the total
	 * amount to be bought (or sold) and the amount to be bought (or sold) at
	 * specified price variations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmScale = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			definition = "Order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "SCAL";
		}
	};
	/**
	 * Make the order active until notified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WORK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Make the order active until notified."</li>
	 * </ul>
	 */
	public static final MMCode mmWork = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "WORK";
		}
	};
	/**
	 * Add on another order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddOnOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Add on another order."</li>
	 * </ul>
	 */
	public static final MMCode mmAddOnOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddOnOrder";
			definition = "Add on another order.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "ADOO";
		}
	};
	/**
	 * Indicates that a position in the underlying is traded for a futures
	 * position in the physical commodity markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EFPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that a position in the underlying is traded for a futures position in the physical commodity markets."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExchangeForPhysicalTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTransaction";
			definition = "Indicates that a position in the underlying is traded for a futures position in the physical commodity markets.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "EFPH";
		}
	};
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmImbalanceOnly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "IMBO";
		}
	};
	/**
	 * Limit order, where the limit price fluctuates relative to another
	 * quantity, such as the last sale, midpoint, opening price, bid, offer, or
	 * VWAP (Volume Weighted Average Price).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PGGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPegged = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			definition = "Limit order, where the limit price fluctuates relative to another quantity, such as the last sale, midpoint, opening price, bid, offer, or VWAP (Volume Weighted Average Price).";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "PGGD";
		}
	};
	/**
	 * Indicates an order which may be executed in partials or outside the hours
	 * of the exchange or other exchange rules.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
	 * CustomerHandlingInstructionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotHeld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an order which may be executed in partials or outside the hours of the exchange or other exchange rules."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotHeld = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			definition = "Indicates an order which may be executed in partials or outside the hours of the exchange or other exchange rules.";
			owner_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			codeName = "NOHE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIKI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerHandlingInstructionsCode";
				definition = "Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Firms that are taking in orders manually but routing for execution electronically and for compliance reporting must capture the client's handling instructions.This is intended for reporting only ( OATS =  Order Audit Trail System - Phase III regulatory requirement).";
				code_lazy = () -> Arrays.asList(CustomerHandlingInstructionsCode.mmFillOrKill, CustomerHandlingInstructionsCode.mmImmediateOrCancel, CustomerHandlingInstructionsCode.mmAllOrNone, CustomerHandlingInstructionsCode.mmScale,
						CustomerHandlingInstructionsCode.mmWork, CustomerHandlingInstructionsCode.mmAddOnOrder, CustomerHandlingInstructionsCode.mmExchangeForPhysicalTransaction, CustomerHandlingInstructionsCode.mmImbalanceOnly,
						CustomerHandlingInstructionsCode.mmPegged, CustomerHandlingInstructionsCode.mmNotHeld);
			}
		});
		return mmObject_lazy.get();
	}
}