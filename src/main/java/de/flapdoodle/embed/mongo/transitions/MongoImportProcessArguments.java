/**
 * Copyright (C) 2011
 *   Michael Mosmann <michael@mosmann.de>
 *   Martin Jöhren <m.joehren@googlemail.com>
 *
 * with contributions from
 * 	konstantin-ba@github,Archimedes Trajano	(trajano@github)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.embed.mongo.transitions;

import de.flapdoodle.embed.mongo.commands.MongoImportArguments;
import de.flapdoodle.reverse.StateID;
import de.flapdoodle.reverse.naming.HasLabel;
import org.immutables.value.Value;

@Value.Immutable
public abstract class MongoImportProcessArguments extends MongoToolsProcessArguments<MongoImportArguments> implements HasLabel {

	@Override
	@Value.Auxiliary
	public String transitionLabel() {
		return "Create mongoImport arguments";
	}

	@Override
	@Value.Default
	public StateID<MongoImportArguments> arguments() {
		return StateID.of(MongoImportArguments.class);
	}

	public static ImmutableMongoImportProcessArguments withDefaults() {
		return builder().build();
	}

	public static ImmutableMongoImportProcessArguments.Builder builder() {
		return ImmutableMongoImportProcessArguments.builder();
	}
}
