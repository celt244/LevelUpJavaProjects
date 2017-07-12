package ua.dp.levelup.core.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MOVIE_SESSIONS")
public class MovieSession {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long movieSessionId;
  private long filmId;
  @Temporal(TemporalType.DATE)
  @JsonFormat
          (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date sessionStartDate;
  @Temporal(TemporalType.TIME)
  @JsonFormat
          (shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
  private Date sessionStartTime;
  private int hallNumber;
  private double standardTicketPrice;
  private double comfortTicketPrice;

  public MovieSession(long filmId, Date sessionStartDate, Date sessionStartTime, int hallNumber, double standardTicketPrice, double comfortTicketPrice) {
    this.filmId = filmId;
    this.sessionStartDate = sessionStartDate;
    this.sessionStartTime = sessionStartTime;
    this.hallNumber = hallNumber;
    this.standardTicketPrice = standardTicketPrice;
    this.comfortTicketPrice = comfortTicketPrice;
  }
}
