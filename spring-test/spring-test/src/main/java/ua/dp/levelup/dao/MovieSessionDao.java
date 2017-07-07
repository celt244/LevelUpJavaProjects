package ua.dp.levelup.dao;

import ua.dp.levelup.core.model.MovieSession;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface MovieSessionDao {

    void createMovieSession(MovieSession session);

    MovieSession getMovieSessionById(long sessionId);

<<<<<<< HEAD:spring-test/spring-test/src/main/java/ua/dp/levelup/dao/MovieSessionDao.java
    List<MovieSession> getAllMovieSessions();
=======
    List<MovieSession> getAllMoviesSessions();
>>>>>>> 0ef6b5447b4316f035ec60d3095cf87e2e74cd8f:spring-test/src/main/java/ua/dp/levelup/dao/MovieSessionDao.java
}
