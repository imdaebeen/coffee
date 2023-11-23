package main.java.com.daebeen.coffee.point.domain;

import java.util.List;

public interface PointRepository extends JpaRepository<Point, Long> {
    List<Point> findAllByUserUserId(String userId);

}