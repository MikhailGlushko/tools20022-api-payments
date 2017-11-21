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
 * List of incidents happening during the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCustomerCancel
 * FailureReasonCode.mmCustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmMalfunction
 * FailureReasonCode.mmMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmPartial
 * FailureReasonCode.mmPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmTooLateResponse
 * FailureReasonCode.mmTooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmUnableToComplete
 * FailureReasonCode.mmUnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmUnableToSend
 * FailureReasonCode.mmUnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmTimeOut
 * FailureReasonCode.mmTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCardDeclined
 * FailureReasonCode.mmCardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmOnLineDeclined
 * FailureReasonCode.mmOnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmOfflineDeclined
 * FailureReasonCode.mmOfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmSuspectedFraud
 * FailureReasonCode.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmSecurityError
 * FailureReasonCode.mmSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCardCaptured
 * FailureReasonCode.mmCardCaptured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCardError
 * FailureReasonCode.mmCardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCustomerDecline
 * FailureReasonCode.mmCustomerDecline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmForgottenCard
 * FailureReasonCode.mmForgottenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmFullfilmentError
 * FailureReasonCode.mmFullfilmentError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmOutOfCustomerService
 * FailureReasonCode.mmOutOfCustomerService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmUnableToCapture
 * FailureReasonCode.mmUnableToCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmSecurity
 * FailureReasonCode.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmHardware
 * FailureReasonCode.mmHardware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCompromised
 * FailureReasonCode.mmCompromised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmExpired
 * FailureReasonCode.mmExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmInvalidKCV
 * FailureReasonCode.mmInvalidKCV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmKeyLoadError
 * FailureReasonCode.mmKeyLoadError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCardRetained
 * FailureReasonCode.mmCardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode#mmCustomerTimeOut
 * FailureReasonCode.mmCustomerTimeOut}</li>
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
 * <li>"CUCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FailureReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "List of incidents happening during the transaction."</li>
 * </ul>
 */
public class FailureReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Customer cancellation, for example removing the card before the end of
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer cancellation, for example removing the card before the end of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerCancel";
			definition = "Customer cancellation, for example removing the card before the end of the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUCL";
		}
	};
	/**
	 * Suspected malfunction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MALF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Suspected malfunction."</li>
	 * </ul>
	 */
	public static final MMCode mmMalfunction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Malfunction";
			definition = "Suspected malfunction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "MALF";
		}
	};
	/**
	 * Completed partially.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Completed partially."</li>
	 * </ul>
	 */
	public static final MMCode mmPartial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Partial";
			definition = "Completed partially.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Response to the previous message was received too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the previous message was received too late."</li>
	 * </ul>
	 */
	public static final MMCode mmTooLateResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TooLateResponse";
			definition = "Response to the previous message was received too late.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Unable to complete the transaction after the authorisation response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unable to complete the transaction after the authorisation response."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToComplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnableToComplete";
			definition = "Unable to complete the transaction after the authorisation response.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "UCMP";
		}
	};
	/**
	 * Unable to deliver the request message to the recipient party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unable to deliver the request message to the recipient party."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToSend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnableToSend";
			definition = "Unable to deliver the request message to the recipient party.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "USND";
		}
	};
	/**
	 * Timeout while waiting for a response to a request message, or no response
	 * was received (for example connection release before receiving the
	 * response).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Timeout while waiting for a response to a request message, or no response was received (for example connection release before receiving the response)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeOut";
			definition = "Timeout while waiting for a response to a request message, or no response was received (for example connection release before receiving the response).";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "TIMO";
		}
	};
	/**
	 * Integrated circuit card declines the transaction before or after the
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Integrated circuit card declines the transaction before or after the authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardDeclined";
			definition = "Integrated circuit card declines the transaction before or after the authorisation.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDCL";
		}
	};
	/**
	 * Online authorisation declined the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Online authorisation declined the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOnLineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLineDeclined";
			definition = "Online authorisation declined the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "NDCL";
		}
	};
	/**
	 * Offline authorisation declined the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline authorisation declined the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfflineDeclined";
			definition = "Offline authorisation declined the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "FDCL";
		}
	};
	/**
	 * Card payment transaction fails because the merchant suspect a fraud.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction fails because the merchant suspect a fraud."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspectedFraud";
			definition = "Card payment transaction fails because the merchant suspect a fraud.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SFRD";
		}
	};
	/**
	 * Security error has occurred in the authorisation response message sent by
	 * the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security error has occurred in the authorisation response message sent by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecurityError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityError";
			definition = "Security error has occurred in the authorisation response message sent by the acquirer.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * ATM manager has requested to capture the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCaptured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM manager has requested to capture the card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardCaptured = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptured";
			definition = "ATM manager has requested to capture the card.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDCP";
		}
	};
	/**
	 * Unable to complete transaction with the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to complete transaction with the card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			definition = "Unable to complete transaction with the card.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDER";
		}
	};
	/**
	 * Customer has declined additional fees or a lower amount, transaction
	 * fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDecline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer has declined additional fees or a lower amount, transaction fails."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerDecline = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecline";
			definition = "Customer has declined additional fees or a lower amount, transaction fails.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUDC";
		}
	};
	/**
	 * Customer has left the card in the ATM or a motorised card reader.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDFG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForgottenCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer has left the card in the ATM or a motorised card reader."</li>
	 * </ul>
	 */
	public static final MMCode mmForgottenCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForgottenCard";
			definition = "Customer has left the card in the ATM or a motorised card reader.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDFG";
		}
	};
	/**
	 * Unable to fulfil, for instance dispensing the cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FILL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullfilmentError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to fulfil, for instance dispensing the cash."</li>
	 * </ul>
	 */
	public static final MMCode mmFullfilmentError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullfilmentError";
			definition = "Unable to fulfil, for instance dispensing the cash.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "FILL";
		}
	};
	/**
	 * ATM manager has requested to the ATM to stop customer services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSRV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfCustomerService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ATM manager has requested to the ATM to stop customer services."</li>
	 * </ul>
	 */
	public static final MMCode mmOutOfCustomerService = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfCustomerService";
			definition = "ATM manager has requested to the ATM to stop customer services.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CSRV";
		}
	};
	/**
	 * Unable to capture the card as requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to capture the card as requested."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToCapture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToCapture";
			definition = "Unable to capture the card as requested.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "UCPT";
		}
	};
	/**
	 * General security error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General security error."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "General security error.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * Hardware error on the device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hardware"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hardware error on the device."</li>
	 * </ul>
	 */
	public static final MMCode mmHardware = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			definition = "Hardware error on the device.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "HRDW";
		}
	};
	/**
	 * Key is compromised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compromised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key is compromised."</li>
	 * </ul>
	 */
	public static final MMCode mmCompromised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compromised";
			definition = "Key is compromised.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CMPR";
		}
	};
	/**
	 * Key has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key has expired."</li>
	 * </ul>
	 */
	public static final MMCode mmExpired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Key has expired.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "EXPR";
		}
	};
	/**
	 * Key check value is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KCVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidKCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key check value is incorrect."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidKCV = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidKCV";
			definition = "Key check value is incorrect.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "KCVE";
		}
	};
	/**
	 * Error during the key download in the security device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KLOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyLoadError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Error during the key download in the security device."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyLoadError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyLoadError";
			definition = "Error during the key download in the security device.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "KLOD";
		}
	};
	/**
	 * Card has been retained by the ATM or the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRetained"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card has been retained by the ATM or the terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmCardRetained = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			definition = "Card has been retained by the ATM or the terminal.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDRT";
		}
	};
	/**
	 * Customer has not been performed in time an action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer has not been performed in time an action."</li>
	 * </ul>
	 */
	public static final MMCode mmCustomerTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTimeOut";
			definition = "Customer has not been performed in time an action.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUTO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CUCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailureReasonCode";
				definition = "List of incidents happening during the transaction.";
				code_lazy = () -> Arrays.asList(FailureReasonCode.mmCustomerCancel, FailureReasonCode.mmMalfunction, FailureReasonCode.mmPartial, FailureReasonCode.mmTooLateResponse, FailureReasonCode.mmUnableToComplete,
						FailureReasonCode.mmUnableToSend, FailureReasonCode.mmTimeOut, FailureReasonCode.mmCardDeclined, FailureReasonCode.mmOnLineDeclined, FailureReasonCode.mmOfflineDeclined, FailureReasonCode.mmSuspectedFraud,
						FailureReasonCode.mmSecurityError, FailureReasonCode.mmCardCaptured, FailureReasonCode.mmCardError, FailureReasonCode.mmCustomerDecline, FailureReasonCode.mmForgottenCard, FailureReasonCode.mmFullfilmentError,
						FailureReasonCode.mmOutOfCustomerService, FailureReasonCode.mmUnableToCapture, FailureReasonCode.mmSecurity, FailureReasonCode.mmHardware, FailureReasonCode.mmCompromised, FailureReasonCode.mmExpired,
						FailureReasonCode.mmInvalidKCV, FailureReasonCode.mmKeyLoadError, FailureReasonCode.mmCardRetained, FailureReasonCode.mmCustomerTimeOut);
			}
		});
		return mmObject_lazy.get();
	}
}