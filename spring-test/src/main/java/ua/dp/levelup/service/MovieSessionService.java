package ua.dp.levelup.service;

import ua.dp.levelup.core.model.MovieSession;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface MovieSessionService {

    void createMovieSession(MovieSession session);

    MovieSession getMovieSessionById(long sessionId);

    List<MovieSession> getAllMovieSessions();

    List<MovieSession> getAllMovieSessionsForToday();
}
