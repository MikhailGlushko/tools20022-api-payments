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

package com.tools20022.repository.other;

import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The W3C XML Schema that specifies following standard signature:<br>
 * XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10
 * June 2008<br>
 * http://www.w3.org/TR/2008/REC-xmldsig-core-20080610/.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMExternalSchema#getNamespaceList
 * namespaceList} =
 * <ul>
 * <li>"http://www.w3.org/2000/09/xmldsig#"</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMExternalSchema#getProcessContent
 * processContent} = com.tools20022.metamodel.MMProcessContent.STRICT</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOnlyReferenceElement#forSignatureEnvelopeReference
 * ConstraintOnlyReferenceElement.forSignatureEnvelopeReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SignatureEnvelopeReference"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The W3C XML Schema that specifies following standard signature:\r\n XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10 June 2008\r\nhttp://www.w3.org/TR/2008/REC-xmldsig-core-20080610/."
 * </li>
 * </ul>
 */
public class SignatureEnvelopeReference {

	final static private AtomicReference<MMExternalSchema> mmObject_lazy = new AtomicReference<>();

	final static public MMExternalSchema mmObject() {
		mmObject_lazy.compareAndSet(null, new MMExternalSchema() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOnlyReferenceElement.forSignatureEnvelopeReference);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureEnvelopeReference";
				definition = "The W3C XML Schema that specifies following standard signature:\r\n XML Signature Syntax and Processing (Second Edition) W3C Recommendation 10 June 2008\r\nhttp://www.w3.org/TR/2008/REC-xmldsig-core-20080610/.";
				namespaceList = Arrays.asList("http://www.w3.org/2000/09/xmldsig#");
				processContent = MMProcessContent.STRICT;
			}
		});
		return mmObject_lazy.get();
	}
}