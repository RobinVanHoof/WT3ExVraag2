package edu.ap.rest;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.txt.TXTParser;

public class QuotesSearchResource extends ServerResource {
	
	@Get("html")
	public String getSearchQuotes(String searchTerm) {
		searchTerm = getAttribute("searchTerm");
		TXTParser parser = new TXTParser();
		return parser.getSearchQuotes(searchTerm);
	}
}
