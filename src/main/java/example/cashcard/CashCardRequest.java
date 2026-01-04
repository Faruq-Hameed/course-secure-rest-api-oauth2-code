package example.cashcard;

/**
 * A request object for POSTing a cash card
 * More suitable for post operation which nly contains amount
 *
 * @author Josh Cummings
 */
public record CashCardRequest(Double amount) {
}
