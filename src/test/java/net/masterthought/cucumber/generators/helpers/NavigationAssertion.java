package net.masterthought.cucumber.generators.helpers;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class NavigationAssertion extends ReportAssertion {

    public NavigationItemAssertion[] getNaviBarLinks() {
        return allBySelector("a", NavigationItemAssertion.class);
    }

    public void hasPluginName() {
        String pluginName = oneBySelector("p", WebAssertion.class).text();
        assertThat(pluginName).isEqualTo("Cucumber-JVM Report");
    }

}