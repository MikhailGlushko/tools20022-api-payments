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
import com.tools20022.repository.codeset.ServiceTaxDesignationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the taxable status of the service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode#Exempt
 * ServiceTaxDesignationCode.Exempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode#ZeroRate
 * ServiceTaxDesignationCode.ZeroRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode#Taxable
 * ServiceTaxDesignationCode.Taxable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ServiceTaxDesignation1Code
 * ServiceTaxDesignation1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"XMPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceTaxDesignationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the taxable status of the service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServiceTaxDesignationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No taxes are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
	 * ServiceTaxDesignationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XMPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No taxes are due."</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignationCode Exempt = new ServiceTaxDesignationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exempt";
			definition = "No taxes are due.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignationCode.mmObject();
			codeName = "XMPT";
		}
	};
	/**
	 * Tax is due but at zero percent and a zero charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
	 * ServiceTaxDesignationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZERO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is due but at zero percent and a zero charge."</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignationCode ZeroRate = new ServiceTaxDesignationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZeroRate";
			definition = "Tax is due but at zero percent and a zero charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignationCode.mmObject();
			codeName = "ZERO";
		}
	};
	/**
	 * One or more taxes are due on this service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
	 * ServiceTaxDesignationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Taxable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "One or more taxes are due on this service."</li>
	 * </ul>
	 */
	public static final ServiceTaxDesignationCode Taxable = new ServiceTaxDesignationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Taxable";
			definition = "One or more taxes are due on this service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceTaxDesignationCode.mmObject();
			codeName = "TAXE";
		}
	};
	final static private LinkedHashMap<String, ServiceTaxDesignationCode> codesByName = new LinkedHashMap<>();

	protected ServiceTaxDesignationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("XMPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceTaxDesignationCode";
				definition = "Defines the taxable status of the service.";
				derivation_lazy = () -> Arrays.asList(ServiceTaxDesignation1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceTaxDesignationCode.Exempt, com.tools20022.repository.codeset.ServiceTaxDesignationCode.ZeroRate,
						com.tools20022.repository.codeset.ServiceTaxDesignationCode.Taxable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exempt.getCodeName().get(), Exempt);
		codesByName.put(ZeroRate.getCodeName().get(), ZeroRate);
		codesByName.put(Taxable.getCodeName().get(), Taxable);
	}

	public static ServiceTaxDesignationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServiceTaxDesignationCode[] values() {
		ServiceTaxDesignationCode[] values = new ServiceTaxDesignationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServiceTaxDesignationCode> {
		@Override
		public ServiceTaxDesignationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServiceTaxDesignationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}