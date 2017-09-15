/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;
import zw.org.nbsz.business.domain.util.PackType;
import zw.org.nbsz.business.domain.util.PassFail;
import zw.org.nbsz.business.domain.util.ReasonForTesting;
import zw.org.nbsz.business.domain.util.YesNo;
import zw.org.nbsz.business.domain.util.YesNoNA;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Entity
public class DonationStats implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated
    private YesNo feelingWellToday;
    @Enumerated
    private YesNo refusedToDonate;
    @Enumerated
    private YesNo beenToMalariaArea;
    @Enumerated
    private YesNo mealOrSnack;
    @Enumerated
    private YesNo dangerousOccupation;
    @Enumerated
    private YesNo rheumaticFever;
    @Enumerated
    private YesNo lungDisease;
    @Enumerated
    private YesNo cancer;
    @Enumerated
    private YesNo diabetes;
    @Enumerated
    private YesNo chronicMedicalCondition;
    @Enumerated
    private YesNo beenToDentist;
    @Enumerated
    private YesNo takenAntibiotics;
    @Enumerated
    private YesNo injection;
    @Enumerated
    private YesNo beenIll;
    @Enumerated
    private YesNo receivedBloodTransfusion;
    private YesNo hivTest;
    @Enumerated
    private YesNo beenTestedForHiv;
    @Enumerated
    private YesNo accidentalExposureToBlood;
    @Enumerated
    private YesNo beenTattooedOrPierced;
    @Enumerated
    private YesNo injectedWithIllegalDrugs;
    @Enumerated
    private YesNo sexWithSomeoneWithUnknownBackground;
    @Enumerated
    private YesNo exchangedMoneyForSex;
    @Enumerated
    private YesNo trueForSexPartner;
    @Enumerated
    private YesNo sufferedFromSTD;
    @Enumerated
    private YesNoNA monogamousRelationship;
    @Enumerated
    private YesNo sufferedFromNightSweats;
    @Enumerated
    private PassFail copperSulphate;
    @Enumerated
    private PassFail hamocue;
    @Enumerated
    private PackType packType;
    @Enumerated
    private ReasonForTesting reasonForTesting;
    @Enumerated
    private YesNo contactWithPersonWithYellowJaundice;
    @Enumerated
    private YesNo victimOfSexualAbuse;
    private Double weight;
    private String bloodPressure;
    @Enumerated
    private YesNo pregnant;
    @Enumerated
    private YesNo breastFeeding;
    @ManyToOne
    private Person person;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date entryDate;
    
    @Transient
    private String entry;
    
    public DonationStats(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public YesNo getFeelingWellToday() {
        return feelingWellToday;
    }

    public void setFeelingWellToday(YesNo feelingWellToday) {
        this.feelingWellToday = feelingWellToday;
    }

    public YesNo getRefusedToDonate() {
        return refusedToDonate;
    }

    public void setRefusedToDonate(YesNo refusedToDonate) {
        this.refusedToDonate = refusedToDonate;
    }

    public YesNo getBeenToMalariaArea() {
        return beenToMalariaArea;
    }

    public void setBeenToMalariaArea(YesNo beenToMalariaArea) {
        this.beenToMalariaArea = beenToMalariaArea;
    }

    public YesNo getMealOrSnack() {
        return mealOrSnack;
    }

    public void setMealOrSnack(YesNo mealOrSnack) {
        this.mealOrSnack = mealOrSnack;
    }

    public YesNo getDangerousOccupation() {
        return dangerousOccupation;
    }

    public void setDangerousOccupation(YesNo dangerousOccupation) {
        this.dangerousOccupation = dangerousOccupation;
    }

    public YesNo getRheumaticFever() {
        return rheumaticFever;
    }

    public void setRheumaticFever(YesNo rheumaticFever) {
        this.rheumaticFever = rheumaticFever;
    }

    public YesNo getLungDisease() {
        return lungDisease;
    }

    public void setLungDisease(YesNo lungDisease) {
        this.lungDisease = lungDisease;
    }

    public YesNo getCancer() {
        return cancer;
    }

    public void setCancer(YesNo cancer) {
        this.cancer = cancer;
    }

    public YesNo getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(YesNo diabetes) {
        this.diabetes = diabetes;
    }

    public YesNo getChronicMedicalCondition() {
        return chronicMedicalCondition;
    }

    public void setChronicMedicalCondition(YesNo chronicMedicalCondition) {
        this.chronicMedicalCondition = chronicMedicalCondition;
    }

    public YesNo getBeenToDentist() {
        return beenToDentist;
    }

    public void setBeenToDentist(YesNo beenToDentist) {
        this.beenToDentist = beenToDentist;
    }

    public YesNo getTakenAntibiotics() {
        return takenAntibiotics;
    }

    public void setTakenAntibiotics(YesNo takenAntibiotics) {
        this.takenAntibiotics = takenAntibiotics;
    }

    public YesNo getInjection() {
        return injection;
    }

    public void setInjection(YesNo injection) {
        this.injection = injection;
    }

    public YesNo getBeenIll() {
        return beenIll;
    }

    public void setBeenIll(YesNo beenIll) {
        this.beenIll = beenIll;
    }

    public YesNo getReceivedBloodTransfusion() {
        return receivedBloodTransfusion;
    }

    public void setReceivedBloodTransfusion(YesNo receivedBloodTransfusion) {
        this.receivedBloodTransfusion = receivedBloodTransfusion;
    }

    public YesNo getHivTest() {
        return hivTest;
    }

    public void setHivTest(YesNo hivTest) {
        this.hivTest = hivTest;
    }

    public YesNo getBeenTestedForHiv() {
        return beenTestedForHiv;
    }

    public void setBeenTestedForHiv(YesNo beenTestedForHiv) {
        this.beenTestedForHiv = beenTestedForHiv;
    }

    public YesNo getAccidentalExposureToBlood() {
        return accidentalExposureToBlood;
    }

    public void setAccidentalExposureToBlood(YesNo accidentalExposureToBlood) {
        this.accidentalExposureToBlood = accidentalExposureToBlood;
    }

    public YesNo getBeenTattooedOrPierced() {
        return beenTattooedOrPierced;
    }

    public void setBeenTattooedOrPierced(YesNo beenTattooedOrPierced) {
        this.beenTattooedOrPierced = beenTattooedOrPierced;
    }

    public YesNo getInjectedWithIllegalDrugs() {
        return injectedWithIllegalDrugs;
    }

    public void setInjectedWithIllegalDrugs(YesNo injectedWithIllegalDrugs) {
        this.injectedWithIllegalDrugs = injectedWithIllegalDrugs;
    }

    public YesNo getSexWithSomeoneWithUnknownBackground() {
        return sexWithSomeoneWithUnknownBackground;
    }

    public void setSexWithSomeoneWithUnknownBackground(YesNo sexWithSomeoneWithUnknownBackground) {
        this.sexWithSomeoneWithUnknownBackground = sexWithSomeoneWithUnknownBackground;
    }

    public YesNo getExchangedMoneyForSex() {
        return exchangedMoneyForSex;
    }

    public void setExchangedMoneyForSex(YesNo exchangedMoneyForSex) {
        this.exchangedMoneyForSex = exchangedMoneyForSex;
    }

    public YesNo getTrueForSexPartner() {
        return trueForSexPartner;
    }

    public void setTrueForSexPartner(YesNo trueForSexPartner) {
        this.trueForSexPartner = trueForSexPartner;
    }

    public YesNo getSufferedFromSTD() {
        return sufferedFromSTD;
    }

    public void setSufferedFromSTD(YesNo sufferedFromSTD) {
        this.sufferedFromSTD = sufferedFromSTD;
    }

    public YesNo getSufferedFromNightSweats() {
        return sufferedFromNightSweats;
    }

    public void setSufferedFromNightSweats(YesNo sufferedFromNightSweats) {
        this.sufferedFromNightSweats = sufferedFromNightSweats;
    }

    public PassFail getCopperSulphate() {
        return copperSulphate;
    }

    public void setCopperSulphate(PassFail copperSulphate) {
        this.copperSulphate = copperSulphate;
    }

    public PassFail getHamocue() {
        return hamocue;
    }

    public void setHamocue(PassFail hamocue) {
        this.hamocue = hamocue;
    }

    public PackType getPackType() {
        return packType;
    }

    public void setPackType(PackType packType) {
        this.packType = packType;
    }

    public ReasonForTesting getReasonForTesting() {
        return reasonForTesting;
    }

    public void setReasonForTesting(ReasonForTesting reasonForTesting) {
        this.reasonForTesting = reasonForTesting;
    }

    public YesNo getVictimOfSexualAbuse() {
        return victimOfSexualAbuse;
    }

    public void setVictimOfSexualAbuse(YesNo victimOfSexualAbuse) {
        this.victimOfSexualAbuse = victimOfSexualAbuse;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public YesNo getContactWithPersonWithYellowJaundice() {
        return contactWithPersonWithYellowJaundice;
    }

    public void setContactWithPersonWithYellowJaundice(YesNo contactWithPersonWithYellowJaundice) {
        this.contactWithPersonWithYellowJaundice = contactWithPersonWithYellowJaundice;
    }

    public YesNo getPregnant() {
        return pregnant;
    }

    public void setPregnant(YesNo pregnant) {
        this.pregnant = pregnant;
    }

    public YesNo getBreastFeeding() {
        return breastFeeding;
    }

    public void setBreastFeeding(YesNo breastFeeding) {
        this.breastFeeding = breastFeeding;
    }

    public YesNoNA getMonogamousRelationship() {
        return monogamousRelationship;
    }

    public void setMonogamousRelationship(YesNoNA monogamousRelationship) {
        this.monogamousRelationship = monogamousRelationship;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
    
}
