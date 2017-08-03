/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.nbsz.business.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import zw.org.nbsz.business.domain.util.DonateDefer;
import zw.org.nbsz.business.domain.util.Frequency;
import zw.org.nbsz.business.domain.util.PackType;
import zw.org.nbsz.business.domain.util.PassFail;
import zw.org.nbsz.business.domain.util.ReasonForTesting;
import zw.org.nbsz.business.domain.util.YesNo;

/**
 *
 * @author Tasunungurwa Muzinda
 */
@Entity
public class DonationStats implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    private DonateDefer donateDefer;
    private YesNo feelingWellToday;
    private YesNo refusedToDonate;
    private YesNo beenToMalariaArea;
    private YesNo mealOrSnack;
    private YesNo dangerousOccupation;
    private YesNo rheumaticFever;
    private YesNo lungDisease;
    private YesNo cancer;
    private YesNo diabetes;
    private YesNo chronicMedicalCondition;
    private YesNo beenToDentist;
    private YesNo takenAntibiotics;
    private YesNo injection;
    private YesNo beenIll;
    private YesNo receivedBloodTransfusion;
    private Integer deferPeriod;
    private YesNo sufferedFromMalaria;
    private YesNo yellowJaundice;
    private YesNo hivTest;
    private YesNo beenTestedForHiv;
    private YesNo accidentalExposureToBlood;
    private YesNo beenTattooedOrPierced;
    private YesNo injectedWithIllegalDrugs;
    private YesNo sexWithSomeoneWithUnknownBackground;
    private YesNo exchangedMoneyForSex;
    private YesNo trueForSexPartner;
    private YesNo sufferedFromSTD;
    private YesNo usedCondoms;
    private Frequency howOftenDoYouUseCondoms;
    private YesNo changeInMaritalStatus;
    private YesNo sufferedFromNightSweats;
    private PassFail copperSulphate;
    private PassFail hamocue;
    private PackType packType;
    private ReasonForTesting reasonForTesting;
    private YesNo contactWithPersonWithYellowJaundice;
    private YesNo victimOfSexualAbuse;
    private Double weight;
    private Double height;
    private String bloodPressure;
    @ManyToOne
    private Person person;
    
    public DonationStats(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DonateDefer getDonateDefer() {
        return donateDefer;
    }

    public void setDonateDefer(DonateDefer donateDefer) {
        this.donateDefer = donateDefer;
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

    public Integer getDeferPeriod() {
        return deferPeriod;
    }

    public void setDeferPeriod(Integer deferPeriod) {
        this.deferPeriod = deferPeriod;
    }

    public YesNo getSufferedFromMalaria() {
        return sufferedFromMalaria;
    }

    public void setSufferedFromMalaria(YesNo sufferedFromMalaria) {
        this.sufferedFromMalaria = sufferedFromMalaria;
    }

    public YesNo getYellowJaundice() {
        return yellowJaundice;
    }

    public void setYellowJaundice(YesNo yellowJaundice) {
        this.yellowJaundice = yellowJaundice;
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

    public YesNo getUsedCondoms() {
        return usedCondoms;
    }

    public void setUsedCondoms(YesNo usedCondoms) {
        this.usedCondoms = usedCondoms;
    }

    public Frequency getHowOftenDoYouUseCondoms() {
        return howOftenDoYouUseCondoms;
    }

    public void setHowOftenDoYouUseCondoms(Frequency howOftenDoYouUseCondoms) {
        this.howOftenDoYouUseCondoms = howOftenDoYouUseCondoms;
    }

    public YesNo getChangeInMaritalStatus() {
        return changeInMaritalStatus;
    }

    public void setChangeInMaritalStatus(YesNo changeInMaritalStatus) {
        this.changeInMaritalStatus = changeInMaritalStatus;
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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
}
