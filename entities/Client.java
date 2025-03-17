package entities;

import javax.persistence.*;
import java.util.List;

@Entity 
public class Client {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @ManyToOne 
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {}

    public Client(String name, String email, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.advisor = advisor;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public FinancialAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }
    public List<Portfolio> getPortfolios() { return portfolios; }
    public void setPortfolios(List<Portfolio> portfolios) { this.portfolios = portfolios; }
}
