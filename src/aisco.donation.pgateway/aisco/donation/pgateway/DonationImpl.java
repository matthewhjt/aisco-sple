package aisco.donation.pgateway;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import aisco.donation.core.DonationComponent;

public class DonationImpl extends DonationComponent {
	List <Object> eWalletDonationList, ccDonationList;

    public DonationImpl() {
        System.out.println("\nDonation via EWallet and Kartu Kredit Payment Gateway");
        eWalletDonationList = new ArrayList<>();
        ccDonationList = new ArrayList<>();
    }
    
    public DonationImpl (String name, String email, String phone, int amount, String paymentMethod)
    {
        super(name, email, phone, amount,paymentMethod);
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(eWalletDonationList));
    	System.out.println(Arrays.asList(ccDonationList));
    }

    public void addDonation(){
    	eWalletDonationList.add(new DonationImpl("Bobo", "bobo@jmail.com", "+62878 6654 3321", 2500000, "GoPei"));
    	ccDonationList.add(new DonationImpl("Boba", "boba@jmail.com", "+62828 2345 3091", 500000, "Kartu Kredit Bank Mego"));
    	ccDonationList.add(new DonationImpl("Bobe", "bobe@jmail.com", "+62828 2345 3091", 500000, "Kartu Kredi Bank Sendiri"));
        eWalletDonationList.add(new DonationImpl("Bobi", "bobi@jmail.com", "+62828 2345 3091", 300000, "OPO"));
    }
    
    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "\n";
    }

}
