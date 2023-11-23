
public class QueryDslConfig{

    private final EntityManager em;

    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(em);
    }

}