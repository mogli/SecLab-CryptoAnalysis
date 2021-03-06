/**
 * Copyright by Martin Weidner (martin.weidner@student.kit.edu) and
 * 				Sebastian Schlag (sebastian.schlag@student.kit.edu
 */

import java.util.HashMap;
import java.util.Map.Entry;


public class CaesarAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String s = "N pregnva xvat unq n ornhgvshy tneqra, naq va gur tneqra fgbbq n gerr juvpu ober tbyqra nccyrf. Gurfr nccyrf jrer nyjnlf pbhagrq, naq nobhg gur gvzr jura gurl ortna gb tebj evcr vg jnf sbhaq gung rirel avtug bar bs gurz jnf tbar. Gur xvat orpnzr irel natel ng guvf, naq beqrerq gur tneqrare gb xrrc jngpu nyy avtug haqre gur gerr. Gur tneqrare frg uvf ryqrfg fba gb jngpu; ohg nobhg gjryir b'pybpx ur sryy nfyrrc, naq va gur zbeavat nabgure bs gur nccyrf jnf zvffvat.";
		String s = "Hdbt btc pgt qdgc id vdds ajrz: paa iwtn sd dg ign id sd rdbth gxvwi—paa iwpi upaah id iwtb xh hd bjrw vpxc—paa iwtxg vttht pgt hlpch—paa iwtxg rpgsh pgt igjbeh—idhh iwtb lwxrw lpn ndj lxaa, iwtn lxaa palpnh, axzt eddg ejhh, paxvwi jedc iwtxg atvh, pcs dcan bdkt dc hd bjrw iwt uphitg. Iwt ldgas bpn ktgn axztan cdi palpnh iwxcz du iwtb ph iwtn iwxcz du iwtbhtakth, qji lwpi rpgt iwtn udg iwt ldgas? lwpi rpc xi zcdl pqdji iwt bpiitg?";
		analyzeFrequence(s);
	}

	public static HashMap<Character, Integer> analyzeFrequence(String s) {
		HashMap<Character, Integer> frequence = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()){
			if(!frequence.containsKey(c))
				frequence.put(c, 1);
			else
				frequence.put(c, frequence.get(c)+1);
		}
		for (Entry<Character,Integer> e : frequence.entrySet()) {
			System.out.println(e.getKey() + "\t"+e.getValue());
		}
		return frequence;
	}

}
