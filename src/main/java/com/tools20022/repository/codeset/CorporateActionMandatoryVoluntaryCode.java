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
 * Specifies whether the event is mandatory, mandatory with options or
 * voluntary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode#mmMandatory
 * CorporateActionMandatoryVoluntaryCode.mmMandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode#mmMandatoryWithOptions
 * CorporateActionMandatoryVoluntaryCode.mmMandatoryWithOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode#mmVoluntary
 * CorporateActionMandatoryVoluntaryCode.mmVoluntary}</li>
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
 * <li>"MAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMandatoryVoluntaryCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the event is mandatory, mandatory with options or voluntary."
 * </li>
 * </ul>
 */
public class CorporateActionMandatoryVoluntaryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Participation in CA event is mandatory. Further instructions from the
	 * account owner are not required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participation in CA event is mandatory. Further instructions from the account owner are not required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMandatory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Participation in CA event is mandatory. Further instructions from the account owner are not required.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "MAND";
		}
	};
	/**
	 * Participation in the corporate action is mandatory and further
	 * instructions from the account owner are required, unless a default option
	 * has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryWithOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participation in the corporate action is mandatory and further instructions from the account owner are required, unless a default option has been specified."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMandatoryWithOptions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryWithOptions";
			definition = "Participation in the corporate action is mandatory and further instructions from the account owner are required, unless a default option has been specified.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "CHOS";
		}
	};
	/**
	 * Participation in the corporate action is voluntary. If the owner wishes
	 * to take part in the event, instructions from the account owner are
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode
	 * CorporateActionMandatoryVoluntaryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voluntary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participation in the corporate action is voluntary. If the owner wishes to take part in the event, instructions from the account owner are required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVoluntary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Voluntary";
			definition = "Participation in the corporate action is voluntary. If the owner wishes to take part in the event, instructions from the account owner are required.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "VOLU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("MAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMandatoryVoluntaryCode";
				definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
				code_lazy = () -> Arrays.asList(CorporateActionMandatoryVoluntaryCode.mmMandatory, CorporateActionMandatoryVoluntaryCode.mmMandatoryWithOptions, CorporateActionMandatoryVoluntaryCode.mmVoluntary);
			}
		});
		return mmObject_lazy.get();
	}
}