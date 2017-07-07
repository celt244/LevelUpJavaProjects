package ua.dp.levelup.dao.impl;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dp.levelup.core.model.MovieSession;
import ua.dp.levelup.dao.MovieSessionDao;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Repository
@Transactional
public class MovieSessionDaoImpl implements MovieSessionDao {

    @Autowired
    private HibernateTemplate template;

    @Value(value = "${my.value:default-value}")
    private String value;

    @Override
    public void createMovieSession(MovieSession session) {
        template.save(session);
    }

    @Override
    public MovieSession getMovieSessionById(long sessionId) {
        return template.get(MovieSession.class, sessionId);
    }

    @Override
<<<<<<< HEAD:spring-test/spring-test/src/main/java/ua/dp/levelup/dao/impl/MovieSessionDaoImpl.java
    public List<MovieSession> getAllMovieSessions() {
=======
    public List<MovieSession> getAllMoviesSessions() {
>>>>>>> 0ef6b5447b4316f035ec60d3095cf87e2e74cd8f:spring-test/src/main/java/ua/dp/levelup/dao/impl/MovieSessionDaoImpl.java
        return template.loadAll(MovieSession.class);
    }
}
