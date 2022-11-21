import java.time.LocalDateTime
import java.time.LocalDate
import java.time.LocalTime

class Gigasecond(ts: LocalDateTime) {

    // TODO: Implement proper constructor

    val date: LocalDateTime = ts.plusSeconds(1000000000L);

    constructor(d: LocalDate) : this(d.atStartOfDay())
}
