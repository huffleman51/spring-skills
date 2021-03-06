/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package spring.skills.handler;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.json.SpeechletResponseEnvelope;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;

public class DefaultSessionEndedRequestHandler implements SessionEndedRequestHandler {

	@Override
	public SpeechletResponseEnvelope handleSessionEndedRequest(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
		SpeechletResponseEnvelope responseEnvelope = new SpeechletResponseEnvelope();
		SpeechletResponse response = new SpeechletResponse();
		SimpleCard card = new SimpleCard();
		card.setTitle("Goodbye");
		card.setContent("Goodbye");
		response.setCard(card);
		PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
		outputSpeech.setId("goodbye");
		outputSpeech.setText("Goodbye");
		response.setOutputSpeech(outputSpeech);
		responseEnvelope.setResponse(response);
		return responseEnvelope;
	}

}
