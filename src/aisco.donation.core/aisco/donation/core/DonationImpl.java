package aisco.donation.core;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    List <Object> donationList;

    public DonationImpl()
    {
        System.out.println("Donation via Subscribing AISCO");
        donationList = new ArrayList<>();
    }

    public DonationImpl (String name, String email, String phone, int amount, String duration)
    {
        super(name, email, phone, amount,duration);
    }

    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "3 Bulan"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "2 Tahun"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "6 Bulan"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + duration + "\n";
    }



}