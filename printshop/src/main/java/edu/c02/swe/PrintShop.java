package edu.c02.swe;

public interface PrintShop {

	/**
	 * @param modelCount Anzahl der Modelle
	 * @param express ExpressOption
	 * @return
	 */
	public int calcAllowedDays(int modelCount, boolean express);

	/**
	 * @param allowedDays zulässige Anzahl der Produktionstage
	 * @param neededDays  benötigte Anzahl an Tagen
	 * @param express ExpressOption
	 * @return
	 */
	public int calcDiscount(int allowedDays, int neededDays, boolean express);
}
