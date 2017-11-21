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
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentExecution" src="doc-files/PaymentExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
 * PaymentExecution.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
 * PaymentExecution.mmCreationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmAcceptanceDateTime
 * PaymentExecution.mmAcceptanceDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
 * PaymentExecution.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
 * PaymentExecution.mmProcessingInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
 * PaymentExecution.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
 * PaymentExecution.mmRelatedInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCaseResolution
 * PaymentExecution.mmRelatedInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentExecution#mmNext
 * PaymentExecution.mmNext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionDates2
 * TransactionDates2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
 * OriginalGroupHeader3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
 * OriginalGroupHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
 * OriginalGroupHeader5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
 * OriginalGroupHeader7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
 * OriginalGroupHeader6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
 * Payment.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
 * PaymentInstruction.mmPrevious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
 * PaymentProcessing.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmPaymentTypeInformation
 * RequestedModification6.mmPaymentTypeInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions."
 * </li>
 * </ul>
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Indicates whether the payment is a debit or a credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentExecution.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime creationDate;
	/**
	 * Date and time at which the payment execution was created by the
	 * instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#mmCreationDateTime
	 * GroupHeader58.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmCreationDateTime
	 * GroupHeader48.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmCreationDateTime
	 * GroupHeader55.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#mmOriginalCreationDateTime
	 * OriginalGroupInformation3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmCreationDateTime
	 * GroupHeader56.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalCreationDateTime
	 * OriginalGroupHeader3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmCreationDateTime
	 * GroupHeader52.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmCreationDateTime
	 * GroupHeader50.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmCreationDateTime
	 * GroupHeader53.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmCreationDateTime
	 * GroupHeader47.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmOriginalCreationDateTime
	 * OriginalGroupHeader2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmCreationDateTime
	 * GroupHeader46.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmCreationDateTime
	 * GroupHeader45.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmCreationDateTime
	 * GroupHeader59.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalCreationDateTime
	 * OriginalGroupHeader5.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmCreationDateTime
	 * GroupHeader60.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmCreationDateTime
	 * GroupHeader63.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmCreationDateTime
	 * GroupHeader62.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmCreationDateTime
	 * GroupHeader70.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalCreationDateTime
	 * OriginalNotification10.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification9#mmOriginalCreationDateTime
	 * OriginalNotification9.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmCreationDateTime
	 * GroupHeader72.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmCreationDateTime
	 * GroupHeader71.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalCreationDateTime
	 * OriginalMessage2.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalCreationDateTime
	 * OriginalMessage3.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalCreationDateTime
	 * OriginalGroupInformation27.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalCreationDateTime
	 * OriginalGroupHeader7.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalCreationDateTime
	 * OriginalGroupInformation28.mmOriginalCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalCreationDateTime
	 * OriginalGroupHeader6.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the payment execution was created by the instructing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader58.mmCreationDateTime, GroupHeader48.mmCreationDateTime, GroupHeader55.mmCreationDateTime, OriginalGroupInformation3.mmOriginalCreationDateTime, GroupHeader56.mmCreationDateTime,
					OriginalGroupHeader3.mmOriginalCreationDateTime, GroupHeader52.mmCreationDateTime, GroupHeader50.mmCreationDateTime, GroupHeader53.mmCreationDateTime, GroupHeader47.mmCreationDateTime,
					OriginalGroupHeader2.mmOriginalCreationDateTime, GroupHeader46.mmCreationDateTime, GroupHeader45.mmCreationDateTime, GroupHeader59.mmCreationDateTime, OriginalGroupHeader5.mmOriginalCreationDateTime,
					GroupHeader60.mmCreationDateTime, GroupHeader63.mmCreationDateTime, GroupHeader62.mmCreationDateTime, GroupHeader70.mmCreationDateTime, OriginalNotification10.mmOriginalCreationDateTime,
					OriginalNotification9.mmOriginalCreationDateTime, GroupHeader72.mmCreationDateTime, GroupHeader71.mmCreationDateTime, OriginalMessage2.mmOriginalCreationDateTime, OriginalMessage3.mmOriginalCreationDateTime,
					OriginalGroupInformation27.mmOriginalCreationDateTime, OriginalGroupHeader7.mmOriginalCreationDateTime, OriginalGroupInformation28.mmOriginalCreationDateTime, OriginalGroupHeader6.mmOriginalCreationDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentExecution.class.getMethod("getCreationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime acceptanceDateTime;
	/**
	 * Date and time at which all processing conditions for execution of the
	 * payment are met and adequate financial cover is available at the account
	 * servicing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDates2#mmAcceptanceDateTime
	 * TransactionDates2.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmAcceptanceDateTime
	 * CreditTransferTransaction25.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmAcceptanceDateTime
	 * PaymentTransaction73.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmAcceptanceDateTime
	 * PaymentTransaction80.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmAcceptanceDateTime
	 * PaymentTransaction83.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmAcceptanceDateTime
	 * PaymentTransaction82.mmAcceptanceDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAcceptanceDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionDates2.mmAcceptanceDateTime, CreditTransferTransaction25.mmAcceptanceDateTime, PaymentTransaction73.mmAcceptanceDateTime, PaymentTransaction80.mmAcceptanceDateTime,
					PaymentTransaction83.mmAcceptanceDateTime, PaymentTransaction82.mmAcceptanceDateTime);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentExecution.class.getMethod("getAcceptanceDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Specifies the end to end payment which is at the origin of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmOriginalItem
	 * OriginalNotificationReference8.mmOriginalItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmOriginalItemAndStatus
	 * OriginalNotificationReference7.mmOriginalItemAndStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalGroupInformation
	 * PaymentTransaction73.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalGroupInformation
	 * PaymentTransaction80.mmOriginalGroupInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmTransactionInformation
	 * UnderlyingTransaction16.mmTransactionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmTransactionInformationAndStatus
	 * UnderlyingTransaction17.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the end to end payment which is at the origin of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalNotificationReference8.mmOriginalItem, OriginalNotificationReference7.mmOriginalItemAndStatus, PaymentTransaction73.mmOriginalGroupInformation,
					PaymentTransaction80.mmOriginalGroupInformation, UnderlyingTransaction16.mmTransactionInformation, UnderlyingTransaction17.mmTransactionInformationAndStatus);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentProcessing> processingInstructions;
	/**
	 * Specifies how the payment must be processed, for instance through which
	 * specific clearing channel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPaymentExecution
	 * PaymentProcessing.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmPaymentTypeInformation
	 * GroupHeader50.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction9#mmPaymentTypeInformation
	 * CreditTransferTransaction9.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmPaymentTypeInformation
	 * CreditTransferTransaction23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmPaymentTypeInformation
	 * GroupHeader70.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPaymentTypeInformation
	 * CreditTransferTransaction25.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPaymentTypeInformation
	 * CreditTransferTransaction26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPaymentTypeInformation
	 * CreditTransferTransaction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentTypeInformation
	 * PaymentInstruction21.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentTypeInformation
	 * PaymentInstruction23.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentTypeInformation
	 * PaymentInstruction22.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmPaymentTypeInformation
	 * OriginalTransactionReference24.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmPaymentTypeInformation
	 * OriginalPaymentInformation7.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmPaymentTypeInformation
	 * OriginalTransactionReference26.mmPaymentTypeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPaymentTypeInformation
	 * PaymentComplementaryInformation6.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment must be processed, for instance through which specific clearing channel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProcessingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(GroupHeader50.mmPaymentTypeInformation, CreditTransferTransaction9.mmPaymentTypeInformation, CreditTransferTransaction23.mmPaymentTypeInformation, GroupHeader70.mmPaymentTypeInformation,
					CreditTransferTransaction25.mmPaymentTypeInformation, CreditTransferTransaction26.mmPaymentTypeInformation, CreditTransferTransaction22.mmPaymentTypeInformation, PaymentInstruction21.mmPaymentTypeInformation,
					PaymentInstruction23.mmPaymentTypeInformation, PaymentInstruction22.mmPaymentTypeInformation, OriginalTransactionReference24.mmPaymentTypeInformation, OriginalPaymentInformation7.mmPaymentTypeInformation,
					OriginalTransactionReference26.mmPaymentTypeInformation, PaymentComplementaryInformation6.mmPaymentTypeInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected ISODateTime requestedExecutionDate;
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. <br>
	 * Usage: This is the date on which the debtor's account is to be debited.
	 * If payment by cheque, the date when the cheque must be generated by the
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmRequestedCollectionDate
	 * PaymentInstruction21.mmRequestedCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmRequestedExecutionDate
	 * PaymentInstruction23.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmRequestedExecutionDate
	 * PaymentInstruction22.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7#mmRequestedExecutionDate
	 * OriginalPaymentInformation7.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmRequestedExecutionDate
	 * CorrectivePaymentInitiation2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmRequestedExecutionDate
	 * UnderlyingPaymentInstruction3.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRequestedExecutionDate
	 * PaymentComplementaryInformation6.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRequestedCollectionDate
	 * PaymentComplementaryInformation6.mmRequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstruction21.mmRequestedCollectionDate, PaymentInstruction23.mmRequestedExecutionDate, PaymentInstruction22.mmRequestedExecutionDate,
					OriginalPaymentInformation7.mmRequestedExecutionDate, CorrectivePaymentInitiation2.mmRequestedExecutionDate, UnderlyingPaymentInstruction3.mmRequestedExecutionDate,
					PaymentComplementaryInformation6.mmRequestedExecutionDate, PaymentComplementaryInformation6.mmRequestedCollectionDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentExecution.class.getMethod("getRequestedExecutionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInvestigationCase relatedInvestigationCase;
	/**
	 * Investigation case assigned to the payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase#mmUnderlyingInstruction
	 * PaymentInvestigationCase.mmUnderlyingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCase
	 * PaymentInvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmResolvedCase
	 * OriginalGroupHeader5.mmResolvedCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCase
	 * OriginalGroupHeader6.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case assigned to the payment execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalGroupHeader5.mmResolvedCase, OriginalGroupHeader6.mmCase);
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedInvestigationCaseResolution;
	/**
	 * Payment investigation case resolution which is the source of the
	 * corrected payment execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmPaymentExecutionCorrection
	 * PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestigationCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment investigation case resolution which is the source of the corrected payment execution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};
	protected PaymentInstruction next;
	/**
	 * Specifies the next payment instruction in the payment end-to-end chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmPrevious
	 * PaymentInstruction.mmPrevious}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Next"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the next payment instruction in the payment end-to-end chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNext = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmPrevious;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Rate used to transform the original amount into the credited amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
	 * CurrencyExchange.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to transform the original amount into the credited amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentExecution, com.tools20022.repository.entity.PaymentInstruction.mmPrevious,
						com.tools20022.repository.entity.PaymentProcessing.mmPaymentExecution, com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution,
						com.tools20022.repository.entity.PaymentInvestigationCase.mmUnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmPaymentExecutionCorrection);
				derivationElement_lazy = () -> Arrays.asList(RequestedModification6.mmPaymentTypeInformation);
				subType_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.mmCreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.mmCreationDate,
						com.tools20022.repository.entity.PaymentExecution.mmAcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.mmPayment, com.tools20022.repository.entity.PaymentExecution.mmProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.mmRequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.mmRelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.mmNext, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(TransactionDates2.mmObject(), OriginalGroupHeader3.mmObject(), OriginalGroupHeader2.mmObject(), OriginalGroupHeader5.mmObject(), OriginalGroupHeader7.mmObject(),
						OriginalGroupHeader6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentExecution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public ISODateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(ISODateTime creationDate) {
		this.creationDate = creationDate;
	}

	public ISODateTime getAcceptanceDateTime() {
		return acceptanceDateTime;
	}

	public void setAcceptanceDateTime(ISODateTime acceptanceDateTime) {
		this.acceptanceDateTime = acceptanceDateTime;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public List<PaymentProcessing> getProcessingInstructions() {
		return processingInstructions;
	}

	public void setProcessingInstructions(List<com.tools20022.repository.entity.PaymentProcessing> processingInstructions) {
		this.processingInstructions = processingInstructions;
	}

	public ISODateTime getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return relatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(com.tools20022.repository.entity.PaymentInvestigationCase relatedInvestigationCase) {
		this.relatedInvestigationCase = relatedInvestigationCase;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return relatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedInvestigationCaseResolution) {
		this.relatedInvestigationCaseResolution = relatedInvestigationCaseResolution;
	}

	public PaymentInstruction getNext() {
		return next;
	}

	public void setNext(com.tools20022.repository.entity.PaymentInstruction next) {
		this.next = next;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}
}