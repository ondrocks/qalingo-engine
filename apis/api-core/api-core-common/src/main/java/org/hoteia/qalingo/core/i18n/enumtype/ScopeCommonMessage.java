/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.i18n.enumtype;

/**
 * 
 */
public enum ScopeCommonMessage {

    /**
	 * 
	 */
    COMMON("common"),

    /**
	 * 
	 */
    APP("app"),

    /**
	 * 
	 */
    LEGAL_TERMS("legal_terms"),

    /**
	 * 
	 */
    FOOTER("footer"),

    /**
     * 
     */
    AUTH("auth"),

    /**
     * 
     */
    CONTACT("contact"),
    
    /**
     * 
     */
    ORDER("order"),
    
    /**
	 * 
	 */
    SEO("seo");

    private String propertyKey = "";

    /**
     * Constructor.
     * 
     * @param propertyKey
     *            the property key.
     */
    ScopeCommonMessage(final String propertyKey) {
        this.propertyKey = propertyKey;
    }

    /**
     * Get the localization property key.
     * 
     * @return the localized property key
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

}