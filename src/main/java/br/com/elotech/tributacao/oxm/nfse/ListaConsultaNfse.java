/* 
 * Copyright 2016 ELOTECH GESTAO PUBLICA LTDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package br.com.elotech.tributacao.oxm.nfse;

import java.util.List;

public class ListaConsultaNfse {

	private List<CompNfse> listCompNfse;
	
	private Integer proximaPagina;

	public List<CompNfse> getListCompNfse() {
		return listCompNfse;
	}

	public void setListCompNfse(List<CompNfse> listCompNfse) {
		this.listCompNfse = listCompNfse;
	}

	public Integer getProximaPagina() {
		return proximaPagina;
	}

	public void setProximaPagina(Integer proximaPagina) {
		this.proximaPagina = proximaPagina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaConsultaNfse [listCompNfse=");
		builder.append(listCompNfse);
		builder.append(", proximaPagina=");
		builder.append(proximaPagina);
		builder.append("]");
		return builder.toString();
	}
	
}
