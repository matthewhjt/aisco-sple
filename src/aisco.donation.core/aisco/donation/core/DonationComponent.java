package aisco.donation.core;

public abstract class DonationComponent implements Donation
{
    protected String name;
    protected String email;
    protected String phone;
    protected int amount;
    protected String duration;

    public DonationComponent()
    {
    }

    public DonationComponent (String name, String email, String phone, int amount, String duration)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.duration = duration;
    }

    public abstract void addDonation();
    public abstract void getDonation();

}