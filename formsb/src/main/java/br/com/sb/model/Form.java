package br.com.sb.model;

import java.lang.Math;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Form {
	
	private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString();
	private String cellName;
	private String trailerLocation;
	private String contractor;
	private String hp;
	private String rolt;
	private String forman;
	private String lineman;
	private String groundhand;
	private String jso1;
	private String pdo1;
	private String fc1;
	private String start1;
	private String stop1;
	private String totalFootage1;
	private String jso2;
	private String pdo2;
	private String fc2;
	private String start2;
	private String stop2;
	private String totalFootage2;
	private String jso3;
	private String pdo3;
	private String fc3;
	private String start3;
	private String stop3;
	private String totalFootage3;
	private String jso4;
	private String pdo4;
	private String fc4;
	private String start4;
	private String stop4;
	private String totalFootage4;
	private String jso5;
	private String pdo5;
	private String fc5;
	private String start5;
	private String stop5;
	private String totalFootage5;
	private String jso6;
	private String pdo6;
	private String fc6;
	private String start6;
	private String stop6;
	private String totalFootage6;
	private String jso7;
	private String pdo7;
	private String fc7;
	private String start7;
	private String stop7;
	private String totalFootage7;
	private String jso8;
	private String pdo8;
	private String fc8;
	private String start8;
	private String stop8;
	private String totalFootage8;
	private String jso9;
	private String pdo9;
	private String fc9;
	private String start9;
	private String stop9;
	private String totalFootage9;
	private String jso10;
	private String pdo10;
	private String fc10;
	private String start10;
	private String stop10;
	private String totalFootage10;
	private String jso11;
	private String pdo11;
	private String fc11;
	private String start11;
	private String stop11;
	private String totalFootage11;
	private String jso12;
	private String pdo12;
	private String fc12;
	private String start12;
	private String stop12;
	private String totalFootage12;
	private String jso13;
	private String pdo13;
	private String fc13;
	private String start13;
	private String stop13;
	private String totalFootage13;
	private String jso14;
	private String pdo14;
	private String fc14;
	private String start14;
	private String stop14;
	private String totalFootage14;
	private String jso15;
	private String pdo15;
	private String fc15;
	private String start15;
	private String stop15;
	private String totalFootage15;
	private String jso16;
	private String pdo16;
	private String fc16;
	private String start16;
	private String stop16;
	private String totalFootage16;
	private String washers;
	private String thimbleEyeNut;
	private String longExtensionBolts;
	private String shortExtensionBolts;
	private String suspenseClamps;
	private String angledSuspensionClamps;
	private String jHook;
	private String longEyeNuts;
	private String eyeNuts;
	private String deadEnd144;
	private String deadEnd288;
	private String deadEnd144wThimble;
	private String deadEnd288wThimble;
	private String nuts;
	private String snoShoes;
	private String lashingWire;
	private String lashingClamps;
	private String cableTieStraps;
	private String cableStraps;
	private String Tape;
	private String strandSpacer;
	private String fiberMarkers;
	private String treeGuards;
	private String Copper;
	private String groundingClamps;
	private String universalClamps;
	private String observation;
	private String printName;
	
	public void setJso1(String jso1) {
		this.jso1 = jso1;
	}
	public void setPdo1(String pdo1) {
		this.pdo1 = pdo1;
	}
	public void setFc1(String fc1) {
		this.fc1 = fc1;
	}
	public void setStart1(String start1) {
		this.start1 = start1;
	}
	public void setStop1(String stop1) {
		this.stop1 = stop1;
	}
	public void setTotalFootage1(String totalFootage1) {
		Integer totalFootage1Inteiro;
		if (!this.start1.equals("") || !this.stop1.equals("")) {
			totalFootage1Inteiro = Math.abs(Integer.parseInt(this.start1) - Integer.parseInt(this.stop1));
			
			this.totalFootage1 = totalFootage1Inteiro.toString();
		} else {
			this.totalFootage1 = totalFootage1;
		}
	}
	public void setWashers(String washers) {
		this.washers = washers;
	}
	public void setThimbleEyeNut(String thimbleEyeNut) {
		this.thimbleEyeNut = thimbleEyeNut;
	}
	public void setLongExtensionBolts(String longExtensionBolts) {
		this.longExtensionBolts = longExtensionBolts;
	}
	public void setShortExtensionBolts(String shortExtensionBolts) {
		this.shortExtensionBolts = shortExtensionBolts;
	}
	public void setSuspenseClamps(String suspenseClamps) {
		this.suspenseClamps = suspenseClamps;
	}
	public void setAngledSuspensionClamps(String angledSuspensionClamps) {
		this.angledSuspensionClamps = angledSuspensionClamps;
	}
	public void setjHook(String jHook) {
		this.jHook = jHook;
	}
	public void setLongEyeNuts(String longEyeNuts) {
		this.longEyeNuts = longEyeNuts;
	}
	public void setEyeNuts(String eyeNuts) {
		this.eyeNuts = eyeNuts;
	}
	public void setDeadEnd144(String deadEnd144) {
		this.deadEnd144 = deadEnd144;
	}
	public void setDeadEnd288(String deadEnd288) {
		this.deadEnd288 = deadEnd288;
	}
	public void setDeadEnd144wThimble(String deadEnd144wThimble) {
		this.deadEnd144wThimble = deadEnd144wThimble;
	}
	public void setDeadEnd288wThimble(String deadEnd288wThimble) {
		this.deadEnd288wThimble = deadEnd288wThimble;
	}
	public void setNuts(String nuts) {
		this.nuts = nuts;
	}
	public void setSnoShoes(String snoShoes) {
		this.snoShoes = snoShoes;
	}
	public void setLashingWire(String lashingWire) {
		this.lashingWire = lashingWire;
	}
	public void setLashingClamps(String lashingClamps) {
		this.lashingClamps = lashingClamps;
	}
	public void setCableTieStraps(String cableTieStraps) {
		this.cableTieStraps = cableTieStraps;
	}
	public void setCableStraps(String cableStraps) {
		this.cableStraps = cableStraps;
	}
	public void setTape(String tape) {
		Tape = tape;
	}
	public void setStrandSpacer(String strandSpacer) {
		this.strandSpacer = strandSpacer;
	}
	public void setFiberMarkers(String fiberMarkers) {
		this.fiberMarkers = fiberMarkers;
	}
	public void setTreeGuards(String treeGuards) {
		this.treeGuards = treeGuards;
	}
	public void setCopper(String copper) {
		Copper = copper;
	}
	public void setGroundingClamps(String groundingClamps) {
		this.groundingClamps = groundingClamps;
	}
	public void setUniversalClamps(String universalClamps) {
		this.universalClamps = universalClamps;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getPrintName() {
		return printName;
	}
	public void setPrintName(String printName) {
		this.printName = printName;
	}
	public String getDate() {
		return date;
	}
	public String getJso2() {
		return jso2;
	}
	public void setJso2(String jso2) {
		this.jso2 = jso2;
	}
	public String getPdo2() {
		return pdo2;
	}
	public void setPdo2(String pdo2) {
		this.pdo2 = pdo2;
	}
	public String getFc2() {
		return fc2;
	}
	public void setFc2(String fc2) {
		this.fc2 = fc2;
	}
	public String getStart2() {
		return start2;
	}
	public void setStart2(String start2) {
		this.start2 = start2;
	}
	public String getStop2() {
		return stop2;
	}
	public void setStop2(String stop2) {
		this.stop2 = stop2;
	}
	public String getTotalFootage2() {
		return totalFootage2;
	}
	public void setTotalFootage2(String totalFootage2) {
		Integer totalFootage2Inteiro;
		if (!this.start2.equals("") || !this.stop2.equals("")) {
			totalFootage2Inteiro = Math.abs(Integer.parseInt(this.start2) - Integer.parseInt(this.stop2));
			this.totalFootage2 = totalFootage2Inteiro.toString();
		} else {
			this.totalFootage2 = totalFootage2;
		}
	}
	public String getJso3() {
		return jso3;
	}
	public void setJso3(String jso3) {
		this.jso3 = jso3;
	}
	public String getPdo3() {
		return pdo3;
	}
	public void setPdo3(String pdo3) {
		this.pdo3 = pdo3;
	}
	public String getFc3() {
		return fc3;
	}
	public void setFc3(String fc3) {
		this.fc3 = fc3;
	}
	public String getStart3() {
		return start3;
	}
	public void setStart3(String start3) {
		this.start3 = start3;
	}
	public String getStop3() {
		return stop3;
	}
	public void setStop3(String stop3) {
		this.stop3 = stop3;
	}
	public String getTotalFootage3() {
		return totalFootage3;
	}
	public void setTotalFootage3(String totalFootage3) {
		Integer totalFootage3Inteiro;
		if (!this.start3.equals("") || !this.stop3.equals("")) {
			totalFootage3Inteiro = Math.abs(Integer.parseInt(this.start3) - Integer.parseInt(this.stop3));
			this.totalFootage3 = totalFootage3Inteiro.toString();
		} else {
			this.totalFootage3 = totalFootage3;
		}
	}
	public String getJso4() {
		return jso4;
	}
	public void setJso4(String jso4) {
		this.jso4 = jso4;
	}
	public String getPdo4() {
		return pdo4;
	}
	public void setPdo4(String pdo4) {
		this.pdo4 = pdo4;
	}
	public String getFc4() {
		return fc4;
	}
	public void setFc4(String fc4) {
		this.fc4 = fc4;
	}
	public String getStart4() {
		return start4;
	}
	public void setStart4(String start4) {
		this.start4 = start4;
	}
	public String getStop4() {
		return stop4;
	}
	public void setStop4(String stop4) {
		this.stop4 = stop4;
	}
	public String getTotalFootage4() {
		return totalFootage4;
	}
	public void setTotalFootage4(String totalFootage4) {
		Integer totalFootage4Inteiro;
		if (!this.start4.equals("") || !this.stop4.equals("")) {
			totalFootage4Inteiro = Math.abs(Integer.parseInt(this.start4) - Integer.parseInt(this.stop4));
			this.totalFootage4 = totalFootage4Inteiro.toString();
		} else {
			this.totalFootage4 = totalFootage4;
		}
	}
	public String getJso5() {
		return jso5;
	}
	public void setJso5(String jso5) {
		this.jso5 = jso5;
	}
	public String getPdo5() {
		return pdo5;
	}
	public void setPdo5(String pdo5) {
		this.pdo5 = pdo5;
	}
	public String getFc5() {
		return fc5;
	}
	public void setFc5(String fc5) {
		this.fc5 = fc5;
	}
	public String getStart5() {
		return start5;
	}
	public void setStart5(String start5) {
		this.start5 = start5;
	}
	public String getStop5() {
		return stop5;
	}
	public void setStop5(String stop5) {
		this.stop5 = stop5;
	}
	public String getTotalFootage5() {
		return totalFootage5;
	}
	public void setTotalFootage5(String totalFootage5) {
		Integer totalFootage5Inteiro;
		if (!this.start5.equals("") || !this.stop5.equals("")) {
			totalFootage5Inteiro = Math.abs(Integer.parseInt(this.start5) - Integer.parseInt(this.stop5));
			this.totalFootage5 = totalFootage5Inteiro.toString();
		} else {
			this.totalFootage5 = totalFootage5;
		}
	}
	public String getJso6() {
		return jso6;
	}
	public void setJso6(String jso6) {
		this.jso6 = jso6;
	}
	public String getPdo6() {
		return pdo6;
	}
	public void setPdo6(String pdo6) {
		this.pdo6 = pdo6;
	}
	public String getFc6() {
		return fc6;
	}
	public void setFc6(String fc6) {
		this.fc6 = fc6;
	}
	public String getStart6() {
		return start6;
	}
	public void setStart6(String start6) {
		this.start6 = start6;
	}
	public String getStop6() {
		return stop6;
	}
	public void setStop6(String stop6) {
		this.stop6 = stop6;
	}
	public String getTotalFootage6() {
		return totalFootage6;
	}
	public void setTotalFootage6(String totalFootage6) {
		Integer totalFootage6Inteiro;
		if (!this.start6.equals("") || !this.stop6.equals("")) {
			totalFootage6Inteiro = Math.abs(Integer.parseInt(this.start6) - Integer.parseInt(this.stop6));
			this.totalFootage6 = totalFootage6Inteiro.toString();
		} else {
			this.totalFootage6 = totalFootage6;
		}
	}
	public String getJso7() {
		return jso7;
	}
	public void setJso7(String jso7) {
		this.jso7 = jso7;
	}
	public String getPdo7() {
		return pdo7;
	}
	public void setPdo7(String pdo7) {
		this.pdo7 = pdo7;
	}
	public String getFc7() {
		return fc7;
	}
	public void setFc7(String fc7) {
		this.fc7 = fc7;
	}
	public String getStart7() {
		return start7;
	}
	public void setStart7(String start7) {
		this.start7 = start7;
	}
	public String getStop7() {
		return stop7;
	}
	public void setStop7(String stop7) {
		this.stop7 = stop7;
	}
	public String getTotalFootage7() {
		return totalFootage7;
	}
	public void setTotalFootage7(String totalFootage7) {
		Integer totalFootage7Inteiro;
		if (!this.start7.equals("") || !this.stop7.equals("")) {
			totalFootage7Inteiro = Math.abs(Integer.parseInt(this.start7) - Integer.parseInt(this.stop7));
			this.totalFootage7 = totalFootage7Inteiro.toString();
		} else {
			this.totalFootage7 = totalFootage7;
		}
	}
	public String getJso8() {
		return jso8;
	}
	public void setJso8(String jso8) {
		this.jso8 = jso8;
	}
	public String getPdo8() {
		return pdo8;
	}
	public void setPdo8(String pdo8) {
		this.pdo8 = pdo8;
	}
	public String getFc8() {
		return fc8;
	}
	public void setFc8(String fc8) {
		this.fc8 = fc8;
	}
	public String getStart8() {
		return start8;
	}
	public void setStart8(String start8) {
		this.start8 = start8;
	}
	public String getStop8() {
		return stop8;
	}
	public void setStop8(String stop8) {
		this.stop8 = stop8;
	}
	public String getTotalFootage8() {
		return totalFootage8;
	}
	public void setTotalFootage8(String totalFootage8) {
		Integer totalFootage8Inteiro;
		if (!this.start8.equals("") || !this.stop8.equals("")) {
			totalFootage8Inteiro = Math.abs(Integer.parseInt(this.start8) - Integer.parseInt(this.stop8));
			this.totalFootage8 = totalFootage8Inteiro.toString();
		} else {
			this.totalFootage8 = totalFootage8;
		}
	}
	public String getJso1() {
		return jso1;
	}
	public String getPdo1() {
		return pdo1;
	}
	public String getFc1() {
		return fc1;
	}
	public String getTotalFootage1() {
		return totalFootage1;
	}
	public String getThimbleEyeNut() {
		return thimbleEyeNut;
	}
	public String getJso9() {
		return jso9;
	}
	public void setJso9(String jso9) {
		this.jso9 = jso9;
	}
	public String getPdo9() {
		return pdo9;
	}
	public void setPdo9(String pdo9) {
		this.pdo9 = pdo9;
	}
	public String getFc9() {
		return fc9;
	}
	public void setFc9(String fc9) {
		this.fc9 = fc9;
	}
	public String getStart9() {
		return start9;
	}
	public void setStart9(String start9) {
		this.start9 = start9;
	}
	public String getStop9() {
		return stop9;
	}
	public void setStop9(String stop9) {
		this.stop9 = stop9;
	}
	public String getTotalFootage9() {
		return totalFootage9;
	}
	public void setTotalFootage9(String totalFootage9) {
		Integer totalFootage9Inteiro;
		if (!this.start9.equals("") || !this.stop9.equals("")) {
			totalFootage9Inteiro = Math.abs(Integer.parseInt(this.start9) - Integer.parseInt(this.stop9));
			this.totalFootage9 = totalFootage9Inteiro.toString();
		} else {
			this.totalFootage9 = totalFootage9;
		}
	}
	public String getJso10() {
		return jso10;
	}
	public void setJso10(String jso10) {
		this.jso10 = jso10;
	}
	public String getPdo10() {
		return pdo10;
	}
	public void setPdo10(String pdo10) {
		this.pdo10 = pdo10;
	}
	public String getFc10() {
		return fc10;
	}
	public void setFc10(String fc10) {
		this.fc10 = fc10;
	}
	public String getStart10() {
		return start10;
	}
	public void setStart10(String start10) {
		this.start10 = start10;
	}
	public String getStop10() {
		return stop10;
	}
	public void setStop10(String stop10) {
		this.stop10 = stop10;
	}
	public String getTotalFootage10() {
		return totalFootage10;
	}
	public void setTotalFootage10(String totalFootage10) {
		Integer totalFootage10Inteiro;
		if (!this.start10.equals("") || !this.stop10.equals("")) {
			totalFootage10Inteiro = Math.abs(Integer.parseInt(this.start10) - Integer.parseInt(this.stop10));
			this.totalFootage10 = totalFootage10Inteiro.toString();
		} else {
			this.totalFootage10 = totalFootage10;
		}
	}
	public String getJso11() {
		return jso11;
	}
	public void setJso11(String jso11) {
		this.jso11 = jso11;
	}
	public String getPdo11() {
		return pdo11;
	}
	public void setPdo11(String pdo11) {
		this.pdo11 = pdo11;
	}
	public String getFc11() {
		return fc11;
	}
	public void setFc11(String fc11) {
		this.fc11 = fc11;
	}
	public String getStart11() {
		return start11;
	}
	public void setStart11(String start11) {
		this.start11 = start11;
	}
	public String getStop11() {
		return stop11;
	}
	public void setStop11(String stop11) {
		this.stop11 = stop11;
	}
	public String getTotalFootage11() {
		return totalFootage11;
	}
	public void setTotalFootage11(String totalFootage11) {
		Integer totalFootage11Inteiro;
		if (!this.start11.equals("") || !this.stop11.equals("")) {
			totalFootage11Inteiro = Math.abs(Integer.parseInt(this.start11) - Integer.parseInt(this.stop11));
			this.totalFootage11 = totalFootage11Inteiro.toString();
		} else {
			this.totalFootage11 = totalFootage11;
		}
	}
	public String getJso12() {
		return jso12;
	}
	public void setJso12(String jso12) {
		this.jso12 = jso12;
	}
	public String getPdo12() {
		return pdo12;
	}
	public void setPdo12(String pdo12) {
		this.pdo12 = pdo12;
	}
	public String getFc12() {
		return fc12;
	}
	public void setFc12(String fc12) {
		this.fc12 = fc12;
	}
	public String getStart12() {
		return start12;
	}
	public void setStart12(String start12) {
		this.start12 = start12;
	}
	public String getStop12() {
		return stop12;
	}
	public void setStop12(String stop12) {
		this.stop12 = stop12;
	}
	public String getTotalFootage12() {
		return totalFootage12;
	}
	public void setTotalFootage12(String totalFootage12) {
		Integer totalFootage12Inteiro;
		if (!this.start12.equals("") || !this.stop12.equals("")) {
			totalFootage12Inteiro = Math.abs(Integer.parseInt(this.start12) - Integer.parseInt(this.stop12));
			this.totalFootage12 = totalFootage12Inteiro.toString();
		} else {
			this.totalFootage12 = totalFootage12;
		}
	}
	public String getJso13() {
		return jso13;
	}
	public void setJso13(String jso13) {
		this.jso13 = jso13;
	}
	public String getPdo13() {
		return pdo13;
	}
	public void setPdo13(String pdo13) {
		this.pdo13 = pdo13;
	}
	public String getFc13() {
		return fc13;
	}
	public void setFc13(String fc13) {
		this.fc13 = fc13;
	}
	public String getStart13() {
		return start13;
	}
	public void setStart13(String start13) {
		this.start13 = start13;
	}
	public String getStop13() {
		return stop13;
	}
	public void setStop13(String stop13) {
		this.stop13 = stop13;
	}
	public String getTotalFootage13() {
		return totalFootage13;
	}
	public void setTotalFootage13(String totalFootage13) {
		Integer totalFootage13Inteiro;
		if (!this.start13.equals("") || !this.stop13.equals("")) {
			totalFootage13Inteiro = Math.abs(Integer.parseInt(this.start13) - Integer.parseInt(this.stop13));
			this.totalFootage13 = totalFootage13Inteiro.toString();
		} else {
			this.totalFootage13 = totalFootage13;
		}
	}
	public String getJso14() {
		return jso14;
	}
	public void setJso14(String jso14) {
		this.jso14 = jso14;
	}
	public String getPdo14() {
		return pdo14;
	}
	public void setPdo14(String pdo14) {
		this.pdo14 = pdo14;
	}
	public String getFc14() {
		return fc14;
	}
	public void setFc14(String fc14) {
		this.fc14 = fc14;
	}
	public String getStart14() {
		return start14;
	}
	public void setStart14(String start14) {
		this.start14 = start14;
	}
	public String getStop14() {
		return stop14;
	}
	public void setStop14(String stop14) {
		this.stop14 = stop14;
	}
	public String getTotalFootage14() {
		return totalFootage14;
	}
	public void setTotalFootage14(String totalFootage14) {
		Integer totalFootage14Inteiro;
		if (!this.start14.equals("") || !this.stop14.equals("")) {
			totalFootage14Inteiro = Math.abs(Integer.parseInt(this.start14) - Integer.parseInt(this.stop14));
			this.totalFootage14 = totalFootage14Inteiro.toString();
		} else {
			this.totalFootage14 = totalFootage14;
		}
	}
	public String getJso15() {
		return jso15;
	}
	public void setJso15(String jso15) {
		this.jso15 = jso15;
	}
	public String getPdo15() {
		return pdo15;
	}
	public void setPdo15(String pdo15) {
		this.pdo15 = pdo15;
	}
	public String getFc15() {
		return fc15;
	}
	public void setFc15(String fc15) {
		this.fc15 = fc15;
	}
	public String getStart15() {
		return start15;
	}
	public void setStart15(String start15) {
		this.start15 = start15;
	}
	public String getStop15() {
		return stop15;
	}
	public void setStop15(String stop15) {
		this.stop15 = stop15;
	}
	public String getTotalFootage15() {
		return totalFootage15;
	}
	public void setTotalFootage15(String totalFootage15) {
		Integer totalFootage15Inteiro;
		if (!this.start15.equals("") || !this.stop15.equals("")) {
			totalFootage15Inteiro = Math.abs(Integer.parseInt(this.start15) - Integer.parseInt(this.stop15));
			this.totalFootage15 = totalFootage15Inteiro.toString();
		} else {
			this.totalFootage15 = totalFootage15;
		}
	}
	public String getJso16() {
		return jso16;
	}
	public void setJso16(String jso16) {
		this.jso16 = jso16;
	}
	public String getPdo16() {
		return pdo16;
	}
	public void setPdo16(String pdo16) {
		this.pdo16 = pdo16;
	}
	public String getFc16() {
		return fc16;
	}
	public void setFc16(String fc16) {
		this.fc16 = fc16;
	}
	public String getStart16() {
		return start16;
	}
	public void setStart16(String start16) {
		this.start16 = start16;
	}
	public String getStop16() {
		return stop16;
	}
	public void setStop16(String stop16) {
		this.stop16 = stop16;
	}
	public String getTotalFootage16() {
		return totalFootage16;
	}
	public void setTotalFootage16(String totalFootage16) {
		Integer totalFootage16Inteiro;
		if (!this.start16.equals("") || !this.stop16.equals("")) {
			totalFootage16Inteiro = Math.abs(Integer.parseInt(this.start16) - Integer.parseInt(this.stop16));
			this.totalFootage16 = totalFootage16Inteiro.toString();
		} else {
			this.totalFootage16 = totalFootage16;
		}
	}
	public String getCellName() {
		return cellName;
	}
	public void setCellName(String cellName) {
		this.cellName = cellName;
	}
	public String getTrailerLocation() {
		return trailerLocation;
	}
	public void setTrailerLocation(String trailerLocation) {
		this.trailerLocation = trailerLocation;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getRolt() {
		return rolt;
	}
	public void setRolt(String rolt) {
		this.rolt = rolt;
	}
	public String getForman() {
		return forman;
	}
	public void setForman(String forman) {
		this.forman = forman;
	}
	public String getLineman() {
		return lineman;
	}
	public void setLineman(String lineman) {
		this.lineman = lineman;
	}
	public String getGroundhand() {
		return groundhand;
	}
	public void setGroundhand(String groundhand) {
		this.groundhand = groundhand;
	}
	public String getStart1() {
		return start1;
	}
	public String getStop1() {
		return stop1;
	}
	public String getWashers() {
		return washers;
	}
	public String getLongExtensionBolts() {
		return longExtensionBolts;
	}
	public String getShortExtensionBolts() {
		return shortExtensionBolts;
	}
	public String getSuspenseClamps() {
		return suspenseClamps;
	}
	public String getAngledSuspensionClamps() {
		return angledSuspensionClamps;
	}
	public String getjHook() {
		return jHook;
	}
	public String getLongEyeNuts() {
		return longEyeNuts;
	}
	public String getEyeNuts() {
		return eyeNuts;
	}
	public String getDeadEnd144() {
		return deadEnd144;
	}
	public String getDeadEnd288() {
		return deadEnd288;
	}
	public String getDeadEnd144wThimble() {
		return deadEnd144wThimble;
	}
	public String getDeadEnd288wThimble() {
		return deadEnd288wThimble;
	}
	public String getNuts() {
		return nuts;
	}
	public String getSnoShoes() {
		return snoShoes;
	}
	public String getLashingWire() {
		return lashingWire;
	}
	public String getLashingClamps() {
		return lashingClamps;
	}
	public String getCableTieStraps() {
		return cableTieStraps;
	}
	public String getCableStraps() {
		return cableStraps;
	}
	public String getTape() {
		return Tape;
	}
	public String getStrandSpacer() {
		return strandSpacer;
	}
	public String getFiberMarkers() {
		return fiberMarkers;
	}
	public String getTreeGuards() {
		return treeGuards;
	}
	public String getCopper() {
		return Copper;
	}
	public String getGroundingClamps() {
		return groundingClamps;
	}
	public String getUniversalClamps() {
		return universalClamps;
	}
	
	
	public String FormHtml(Form this) {
		String linha1 = this.observation.substring(0);
		String linha2 = "";
		String linha3 = "";
		String linha4 = "";
		String linha5 = "";
		
		if (this.observation.length()>85) {
			linha1 = linha1.substring(0, 85).concat(System.lineSeparator());
			linha2 = this.observation.substring(86);
			if (this.observation.length()>160) {
				linha2 = this.observation.substring(86, 160).concat(System.lineSeparator());
				linha3 = this.observation.substring(161);
				if (this.observation.length()>241) {
					linha3 = this.observation.substring(161, 241).concat(System.lineSeparator());
					linha4 = this.observation.substring(242);
					if (this.observation.length()>328) {
						linha4 = this.observation.substring(242, 328).concat(System.lineSeparator());
						linha5 = this.observation.substring(329).concat(System.lineSeparator());
					}
				}
			}
		}
		String html = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "\r\n"
				+ "<style>\r\n"
				+ ".littleText{\r\n"
				+ "	width: 60px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".bigText{\r\n"
				+ "	vertical-align: 5;\r\n"
				+ "	width: 150px;\r\n"
				+ "	margin-right: 1em;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".middleText{\r\n"
				+ "	width: 90px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "input[type=\"number\"]{\r\n"
				+ "	width:70px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "table{\r\n"
				+ "	border-collapse: collapse;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "td{\r\n"
				+ "	height: 2em;\r\n"
				+ "	margin: 0em;\r\n"
				+ "	border: 2px solid black;\r\n"
				+ "	text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th {\r\n"
				+ "	padding: .1em;\r\n"
				+ "	margin: 0;\r\n"
				+ "	border: 2px solid black;\r\n"
				+ "	text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "textarea{\r\n"
				+ "	vertical-align:top;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "label{\r\n"
				+ "	vertical-align: 5;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "*{\r\n"
				+ "	page-break-inside: avoid;\r\n"
				+ "	margin-top:0.3em;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "</style>\r\n"
				+ "<title>Formulário</title>\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<form action=\"Formulario\" method=\"post\" id=\"formDados\">\r\n"
				+ "	\r\n"
				+ "		<label style=\"margin-left:72px;\">DATE: " + this.date +"</label>\n"
				+ "		<br>\r\n"
				+ "		<label style=\"margin-left:46px;\">FORMAN: " + this.forman + "</label>\n"
				+ "		<br>\r\n"
				+ "		<label style=\"margin-left:41px;\">LINEMAN: " + this.lineman + "</label>\n"
				+ "		<br>\r\n"
				+ "		<label>GROUNDHAND: </label>"  + this.groundhand + "\n"
				+ "		\r\n"
				+ "		<h3 style=\"margin-top: 1em;\">CELL DISTRIBUTION AND MATERIALS SIGN OF SHEET</h3>\r\n"
				+ "		<label style=\"margin-left:17px;\">CELL NAME: "  + this.cellName + "</label>\n"
				+ "		<label style=\"left:371px; position: absolute;\">HP: " + this.hp + "</label>\n"
				+ "		<br>\r\n"
				+ "		<label style=\"margin-left:4px;\">Trailer Location: "  + this.trailerLocation + "</label>\n"
				+ "		<label style=\"left:350px; position: absolute;\">ROLT: "  + this.rolt + "</label>\n"
				+ "		<br>\r\n"
				+ "		<label>CONTRACTOR: </label>"  + this.contractor + "\n"
				+ "		\r\n"
				+ "		<br>\r\n"
				+ "		<br>\r\n"
				+ "		<hr>\r\n"
				+ "		<br>\r\n"
				+ "		<table style=\"width: 100%; border-collapse: collapse;\">\r\n"
				+ "			<thead>\r\n"
				+ "				<tr>\r\n"
				+ "					<th>JSO/PDO</th>\r\n"
				+ "					<th>PDO</th>\r\n"
				+ "					<th>FC</th>\r\n"
				+ "					<th>START</th>\r\n"
				+ "					<th>STOP</th>\r\n"
				+ "					<th>TOTAL FOOTAGE</th>\r\n"
				+ "				</tr>\r\n"
				+ "			</thead>\r\n"
				+ "			<tbody>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso1 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo1 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc1 +  "</td>\n"
				+ "					<td width=\"3%\">" + this.start1 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop1 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage1 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso2 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo2 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc2 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start2 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop2 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage2 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso3 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo3 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc3 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start3 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop3 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage3 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso4 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo4 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc4 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start4 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop4 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage4 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso5 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo5 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc5 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start5+ "</td>\n"
				+ "					<td width=\"3%\">" + this.stop5 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage5 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso6 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo6 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc6 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start6 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop6 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage6 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso7 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo7 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc7 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start7 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop7 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage7 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso8 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo8 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc8 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start8 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop8 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage8 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso9 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo9 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc9 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start9 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop9 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage9 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso10 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo10 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc10 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start10 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop10 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage10 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso11 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo11 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc11 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start11 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop11 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage11 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso12 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo12 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc12 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start12 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop12 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage12 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso13 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo13 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc13 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start13 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop13 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage13 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso14 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo14 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc14 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start14 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop14 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage14 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso15 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo15 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc15 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start15 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop15 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage15 + "</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td width=\"3%\">" + this.jso16 + "</td>\n"
				+ "					<td width=\"3%\">" + this.pdo16 + "</td>\n"
				+ "					<td width=\"3%\">" + this.fc16 + "</td>\n"
				+ "					<td width=\"3%\">" + this.start16 + "</td>\n"
				+ "					<td width=\"3%\">" + this.stop16 + "</td>\n"
				+ "					<td width=\"3%\">" + this.totalFootage16 + "</td>\n"
				+ "				</tr>\r\n"
				+ "			</tbody>\r\n"
				+ "		</table>\r\n"
				+ "		\r\n"
				+ "		<br>\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<table>\r\n"
				+ "			<thead>\r\n"
				+ "				<tr>\r\n"
				+ "					<th style=\"width: 100px;\">Item #</th>\r\n"
				+ "					<th style=\"width: 210px;\">Construction/Description</th>\r\n"
				+ "					<th style=\"width: 100px;\">Quantity</th>\r\n"
				+ "				</tr>\r\n"
				+ "			</thead>\r\n"
				+ "			<tbody>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43146</td>\r\n"
				+ "					<td >Washers</td>\r\n"
				+ "					<td >"+this.washers+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43148</td>\r\n"
				+ "					<td >Thimble Eye Nut (90 Eye Nut)</td>\r\n"
				+ "					<td >"+this.thimbleEyeNut+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43149</td>\r\n"
				+ "					<td >Long Extension Bolts</td>\r\n"
				+ "					<td >"+this.longExtensionBolts+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43150</td>\r\n"
				+ "					<td >Short Extension Bolts</td>\r\n"
				+ "					<td >"+this.shortExtensionBolts+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43151</td>\r\n"
				+ "					<td >Suspense Clamps</td>\r\n"
				+ "					<td >"+ this.suspenseClamps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43152</td>\r\n"
				+ "					<td >Angled Suspension Clamps</td>\r\n"
				+ "					<td >"+this.angledSuspensionClamps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43153</td>\r\n"
				+ "					<td >J-Hook</td>\r\n"
				+ "					<td >"+this.jHook+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43154</td>\r\n"
				+ "					<td >Long Eye Nuts</td>\r\n"
				+ "					<td >"+this.longEyeNuts+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43156</td>\r\n"
				+ "					<td >Eye Nuts</td>\r\n"
				+ "					<td >"+this.eyeNuts+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43158</td>\r\n"
				+ "					<td >Dead End 144</td>\r\n"
				+ "					<td >"+this.deadEnd144+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43159</td>\r\n"
				+ "					<td >Dead End 288</td>\r\n"
				+ "					<td >"+this.deadEnd288+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43161</td>\r\n"
				+ "					<td >Dead End 144 w/Thimble</td>\r\n"
				+ "					<td >"+this.deadEnd144wThimble+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >43162</td>\r\n"
				+ "					<td >Dead End 288 w/Thimble</td>\r\n"
				+ "					<td >"+this.deadEnd288wThimble+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >1974</td>\r\n"
				+ "					<td >5/8 Nuts</td>\r\n"
				+ "					<td >"+this.nuts+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >30196</td>\r\n"
				+ "					<td >Sno-Shoes(pair)</td>\r\n"
				+ "					<td >"+this.snoShoes+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >14990</td>\r\n"
				+ "					<td >Lashing Wire</td>\r\n"
				+ "					<td >"+this.lashingWire+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >1876</td>\r\n"
				+ "					<td >Lashing Clamps</td>\r\n"
				+ "					<td >"+this.lashingClamps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >17245</td>\r\n"
				+ "					<td >Cable Tie Straps 16\"</td>\r\n"
				+ "					<td >"+this.cableTieStraps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >44506</td>\r\n"
				+ "					<td >Cable Straps 24\"</td>\r\n"
				+ "					<td >"+this.cableStraps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >38391</td>\r\n"
				+ "					<td >Tape</td>\r\n"
				+ "					<td >"+this.Tape+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >17885</td>\r\n"
				+ "					<td >Strand Spacer</td>\r\n"
				+ "					<td >"+this.strandSpacer+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >28935</td>\r\n"
				+ "					<td >Fiber Markers</td>\r\n"
				+ "					<td >"+this.fiberMarkers+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >1938</td>\r\n"
				+ "					<td >Tree Guards</td>\r\n"
				+ "					<td >"+this.treeGuards+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >2053</td>\r\n"
				+ "					<td >Copper</td>\r\n"
				+ "					<td >"+this.Copper+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >5572</td>\r\n"
				+ "					<td >Grounding Clamps</td>\r\n"
				+ "					<td >"+this.groundingClamps+"</td>\n"
				+ "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td >27399</td>\r\n"
				+ "					<td >Universal Clamps</td>\r\n"
				+ "					<td >"+this.universalClamps+"</td>\n"
				+ "				</tr>\r\n"
				+ "			</tbody>\r\n"
				+ "		</table>\r\n"
				+ "		\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<label id=\"observation\">Observation: </label>"+linha1+"\n"
				+ 												"<span style=\"margin-left:87px;\">"+linha2+"</span>\n"
				+ 												"<span style=\"margin-left:87px;\">"+linha3+"</span>\n"
				+ 												"<span style=\"margin-left:87px;\">"+linha4+"</span>\n"
				+ 												"<span style=\"margin-left:87px;\">"+linha5+"</span>\n"
				+ "		\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<hr style=\"margin-top: 0.5em;\">\r\n"
				+ "		<label style=\"margin-top: 1.5em;\">Print Name: "+this.printName+"</label>\n"
				+ "	</form>"
				+ "</body>\r\n"
				+ "</html>";
		return html;
	}

}
