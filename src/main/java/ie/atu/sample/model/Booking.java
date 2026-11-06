package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tables")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Size(min = 2)
    @NotBlank
    private String organiserName;

    @Positive
    private BigDecimal attendeeCount;

    @NotNull
    private Long roomId;

    private String roomStatus;
}
