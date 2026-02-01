package com.google.firebase.heartbeatinfo;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public interface HeartBeatInfo {

    /* loaded from: classes2.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i4) {
            this.code = i4;
        }

        public int b() {
            return this.code;
        }
    }

    @N
    HeartBeat b(@N String str);
}
