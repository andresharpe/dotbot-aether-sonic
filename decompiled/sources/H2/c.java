package H2;

import com.spotify.protocol.mappers.JsonMappingException;

/* loaded from: classes2.dex */
public interface c {
    String a() throws JsonMappingException;

    <T> T b(Class<T> type) throws JsonMappingException;
}
