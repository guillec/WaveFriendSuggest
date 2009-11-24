package com.wavefriend;

import java.util.Iterator;
import java.util.List;

import com.google.wave.api.*;

public class WaveFriendServlet extends AbstractRobotServlet {

  @Override
  public void processEvents(RobotMessageBundle bundle) {
    Wavelet wavelet = bundle.getWavelet();
              
    if (bundle.wasSelfAdded()) {
      Blip blip = wavelet.appendBlip();
      TextView textView = blip.getDocument();
      textView.append("Waaahooo! I am alive!");
      List<String> participants = wavelet.getParticipants();
      Iterator itero = participants.iterator();
      while (itero.hasNext()) {
    	  textView.append(itero.next().toString());  
      }
    }
    
    
            
    
    }
}