package com.kore.chartssdk;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.audiocodes.mv.webrtcsdk.session.ACCallStatistics;
import com.audiocodes.mv.webrtcsdk.session.AudioCodesSession;
import com.audiocodes.mv.webrtcsdk.session.AudioCodesSessionEventListener;
import com.audiocodes.mv.webrtcsdk.session.CallState;
import com.audiocodes.mv.webrtcsdk.session.CallTermination;
import com.audiocodes.mv.webrtcsdk.session.CallTransferState;
import com.audiocodes.mv.webrtcsdk.session.DTMF;
import com.audiocodes.mv.webrtcsdk.session.RemoteContact;
import com.audiocodes.mv.webrtcsdk.useragent.WebRTCException;

import org.webrtc.SurfaceViewRenderer;

import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioCodesSession audioCodesSession = new AudioCodesSession() {
            @Override
            public void addSessionEventListener(AudioCodesSessionEventListener audioCodesSessionEventListener) {

            }

            @Override
            public void removeSessionEventListener(AudioCodesSessionEventListener audioCodesSessionEventListener) {

            }

            @Override
            public CallState getCallState() {
                return null;
            }

            @Override
            public int getSessionID() {
                return 0;
            }

            @Override
            public void setLocaLRenderPosition(int i, int i1) {

            }

            @Override
            public void answer(Hashtable<String, String> hashtable, boolean b) {

            }

            @Override
            public void reject(Hashtable<String, String> hashtable) {

            }

            @Override
            public void redirect(RemoteContact remoteContact, Hashtable<String, String> hashtable) {

            }

            @Override
            public void terminate() {

            }

            @Override
            public void muteAudio(boolean b) {

            }

            @Override
            public void muteVideo(boolean b) {

            }

            @Override
            public boolean isAudioMuted() {
                return false;
            }

            @Override
            public boolean isVideoMuted() {
                return false;
            }

            @Override
            public void sendDTMF(DTMF dtmf) {

            }

            @Override
            public void sendInfo(String s) {

            }

            @Override
            public boolean isOutgoing() {
                return false;
            }

            @Override
            public boolean hasVideo() {
                return false;
            }

            @Override
            public RemoteContact getRemoteNumber() {
                return null;
            }

            @Override
            public void setWithVideo(boolean b) {

            }

            @Override
            public void showVideo(Activity activity) throws WebRTCException {

            }

            @Override
            public void showVideo(SurfaceViewRenderer surfaceViewRenderer, SurfaceViewRenderer surfaceViewRenderer1) throws WebRTCException {

            }

            @Override
            public void switchCamera() {

            }

            @Override
            public boolean hold(boolean b) {
                return false;
            }

            @Override
            public void reinviteWithVideo() {

            }

            @Override
            public void stopVideo() {

            }

            @Override
            public CallTermination getTermination() {
                return null;
            }

            @Override
            public int duration() {
                return 0;
            }

            @Override
            public long getCallStartTime() {
                return 0;
            }

            @Override
            public void setUserData(Object o) {

            }

            @Override
            public Object getUserData() {
                return null;
            }

            @Override
            public boolean isLocalHold() {
                return false;
            }

            @Override
            public boolean isDelayedOffer() {
                return false;
            }

            @Override
            public boolean isRemoteHold() {
                return false;
            }

            @Override
            public ACCallStatistics getStats() {
                return null;
            }

            @Override
            public RemoteContact getRedirectContact() {
                return null;
            }

            @Override
            public boolean transferCall(RemoteContact remoteContact) {
                return false;
            }

            @Override
            public boolean transferCall(AudioCodesSession audioCodesSession) {
                return false;
            }

            @Override
            public RemoteContact getTransferContact() {
                return null;
            }

            @Override
            public CallTransferState getTransferState() {
                return null;
            }
        };
    }
}