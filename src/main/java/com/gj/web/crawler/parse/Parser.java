package com.gj.web.crawler.parse;

import org.jsoup.nodes.Document;

import com.gj.web.crawler.Crawler;
import com.gj.web.crawler.pool.basic.URL;

public interface Parser {
	/**
	 * parse HTML
	 * @param html
	 */
	public void parse(String html,URL url);
	/**
	 * as you can see,use Jsoup.parse(String) before
	 * @param doc
	 */
	public void parse(Document doc,URL url);
	/**
	 * call-back method
	 * it will be invoked once parsing program ends
	 * @param result
	 */
	public void callback(ResultModel result);
}
