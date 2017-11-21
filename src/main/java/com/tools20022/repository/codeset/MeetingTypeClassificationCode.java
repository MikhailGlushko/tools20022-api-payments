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
 * Classifies the meeting type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmAnnual
 * MeetingTypeClassificationCode.mmAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmOrdinary
 * MeetingTypeClassificationCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmClass_
 * MeetingTypeClassificationCode.mmClass_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmIssuerInitiated
 * MeetingTypeClassificationCode.mmIssuerInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmVotingRightsHolderInitiated
 * MeetingTypeClassificationCode.mmVotingRightsHolderInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode#mmCourt
 * MeetingTypeClassificationCode.mmCourt}</li>
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
 * <li>"AMET"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingTypeClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Classifies the meeting type."</li>
 * </ul>
 */
public class MeetingTypeClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and to elect the board members and the auditors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAnnual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			definition = "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "AMET";
		}
	};
	/**
	 * Specifies a meeting which is planned in the by-laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a meeting which is planned in the by-laws."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Specifies a meeting which is planned in the by-laws.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Meeting for holders of a specific type of asset, e.g. preferred shs,
	 * bonds, 
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting for holders of a specific type of asset, e.g. preferred shs, bonds, "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClass_ = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Class";
			definition = "Meeting for holders of a specific type of asset, e.g. preferred shs, bonds, ";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "CLAS";
		}
	};
	/**
	 * Specifies that the meeting is the result of an obligation or a decision
	 * made by the issuer as opposed to voting rights holder initiated, ex.
	 * contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, ex. contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerInitiated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInitiated";
			definition = "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, ex. contested meeting.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Specifies that the meeting is the result of a request or an action of a
	 * voting right holder(s), e.g. contested meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsHolderInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of a request or an action of a voting right holder(s), e.g. contested meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVotingRightsHolderInitiated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsHolderInitiated";
			definition = "Specifies that the meeting is the result of a request or an action of a voting right holder(s), e.g. contested meeting.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "VRHI";
		}
	};
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
	 * MeetingTypeClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Court"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the meeting is the result of a legal proceeding."</li>
	 * </ul>
	 */
	public static final MMCode mmCourt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Court";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "CORT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AMET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingTypeClassificationCode";
				definition = "Classifies the meeting type.";
				code_lazy = () -> Arrays.asList(MeetingTypeClassificationCode.mmAnnual, MeetingTypeClassificationCode.mmOrdinary, MeetingTypeClassificationCode.mmClass_, MeetingTypeClassificationCode.mmIssuerInitiated,
						MeetingTypeClassificationCode.mmVotingRightsHolderInitiated, MeetingTypeClassificationCode.mmCourt);
			}
		});
		return mmObject_lazy.get();
	}
}