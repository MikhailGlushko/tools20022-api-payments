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
 * List of standards insurance clauses. (standard policy wordings issued by the
 * Institute of London Underwriters or the American Institute of Marine
 * Underwriters)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteCargoClauseA
 * InsuranceClausesCode.mmInstituteCargoClauseA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteCargoClauseB
 * InsuranceClausesCode.mmInstituteCargoClauseB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteCargoClauseC
 * InsuranceClausesCode.mmInstituteCargoClauseC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteCargoClauseAir
 * InsuranceClausesCode.mmInstituteCargoClauseAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteWarClauseCargo
 * InsuranceClausesCode.mmInstituteWarClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteStrikesClauseCargo
 * InsuranceClausesCode.mmInstituteStrikesClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteReplacementClause
 * InsuranceClausesCode.mmInstituteReplacementClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteClassificationClause
 * InsuranceClausesCode.mmInstituteClassificationClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmISMCodeEndorsement
 * InsuranceClausesCode.mmISMCodeEndorsement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmComputerMilleniumClauseCargo
 * InsuranceClausesCode.mmComputerMilleniumClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode#mmInstituteRadioactiveContaminationExclusionClause
 * InsuranceClausesCode.mmInstituteRadioactiveContaminationExclusionClause}</li>
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
 * <li>"ICCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceClausesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
 * </li>
 * </ul>
 */
public class InsuranceClausesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Institute Cargo Clause A (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause A (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteCargoClauseA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseA";
			definition = "Institute Cargo Clause A (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ICCA";
		}
	};
	/**
	 * Institute Cargo Clause B (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause B (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteCargoClauseB = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseB";
			definition = "Institute Cargo Clause B (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ICCB";
		}
	};
	/**
	 * Institute Cargo Clause C (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause C (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteCargoClauseC = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseC";
			definition = "Institute Cargo Clause C (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ICCC";
		}
	};
	/**
	 * Institute Cargo Clause for Air (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Cargo Clause for Air (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteCargoClauseAir = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseAir";
			definition = "Institute Cargo Clause for Air (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ICAI";
		}
	};
	/**
	 * Institute War Clause for Cargo (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IWCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteWarClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute War Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteWarClauseCargo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteWarClauseCargo";
			definition = "Institute War Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "IWCC";
		}
	};
	/**
	 * Institute Strikes Clause for Cargo (standard policy wordings issued by
	 * the Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteStrikesClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Strikes Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteStrikesClauseCargo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteStrikesClauseCargo";
			definition = "Institute Strikes Clause for Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ISCC";
		}
	};
	/**
	 * Institute Replacement Clause (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteReplacementClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Replacement Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteReplacementClause = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteReplacementClause";
			definition = "Institute Replacement Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "IREC";
		}
	};
	/**
	 * Institute Classification Clause (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteClassificationClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Classification Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteClassificationClause = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteClassificationClause";
			definition = "Institute Classification Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ICLC";
		}
	};
	/**
	 * ISM Code Endorsement (standard policy wordings issued by the Institute of
	 * London Underwriters or the American Institute of Marine Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISMCodeEndorsement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISM Code Endorsement (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISMCodeEndorsement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISMCodeEndorsement";
			definition = "ISM Code Endorsement (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "ISMC";
		}
	};
	/**
	 * Computer Millenium Clause Cargo (standard policy wordings issued by the
	 * Institute of London Underwriters or the American Institute of Marine
	 * Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComputerMilleniumClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computer Millenium Clause Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmComputerMilleniumClauseCargo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComputerMilleniumClauseCargo";
			definition = "Computer Millenium Clause Cargo (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "CMCC";
		}
	};
	/**
	 * Institute Radioactive Contamination Exclusion Clause (standard policy
	 * wordings issued by the Institute of London Underwriters or the American
	 * Institute of Marine Underwriters)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
	 * InsuranceClausesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteRadioactiveContaminationExclusionClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institute Radioactive Contamination Exclusion Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstituteRadioactiveContaminationExclusionClause = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteRadioactiveContaminationExclusionClause";
			definition = "Institute Radioactive Contamination Exclusion Clause (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
			owner_lazy = () -> InsuranceClausesCode.mmObject();
			codeName = "IRCE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ICCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InsuranceClausesCode";
				definition = "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
				code_lazy = () -> Arrays.asList(InsuranceClausesCode.mmInstituteCargoClauseA, InsuranceClausesCode.mmInstituteCargoClauseB, InsuranceClausesCode.mmInstituteCargoClauseC, InsuranceClausesCode.mmInstituteCargoClauseAir,
						InsuranceClausesCode.mmInstituteWarClauseCargo, InsuranceClausesCode.mmInstituteStrikesClauseCargo, InsuranceClausesCode.mmInstituteReplacementClause, InsuranceClausesCode.mmInstituteClassificationClause,
						InsuranceClausesCode.mmISMCodeEndorsement, InsuranceClausesCode.mmComputerMilleniumClauseCargo, InsuranceClausesCode.mmInstituteRadioactiveContaminationExclusionClause);
			}
		});
		return mmObject_lazy.get();
	}
}