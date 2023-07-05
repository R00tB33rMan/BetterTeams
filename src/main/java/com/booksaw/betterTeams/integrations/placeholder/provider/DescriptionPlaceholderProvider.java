/**
 * 
 */
package com.booksaw.betterTeams.integrations.placeholder.provider;

import com.booksaw.betterTeams.Team;
import com.booksaw.betterTeams.integrations.placeholder.IndividualTeamPlaceholderProvider;
import com.booksaw.betterTeams.message.MessageManager;

/**
 * @author booksaw
 *
 */
public class DescriptionPlaceholderProvider implements IndividualTeamPlaceholderProvider {
	@Override
	public String getPlaceholderForTeam(Team team) {
		System.out.println("here");
		if(team.getDescription() == null || team.getDescription().length() == 0) {
			return MessageManager.getMessage("placeholder.noDescription");
		}
		
		return team.getDescription();
	}
}
