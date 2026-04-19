package com.example.starsgallery.service;

import com.example.starsgallery.beans.Star;
import com.example.starsgallery.dao.IDao;
import java.util.ArrayList;
import java.util.List;

public class StarService implements IDao<Star> {
    private List<Star> stars;
    private static StarService instance;

    private StarService() {
        stars = new ArrayList<>();
        seed();
    }

    public static StarService getInstance() {
        if (instance == null) instance = new StarService();
        return instance;
    }

    private void seed() {
        stars.add(new Star("Emma Watson", "https://upload.wikimedia.org/wikipedia/commons/7/7f/Emma_Watson_2013.jpg", 4.5f));
        stars.add(new Star("Tom Cruise", "https://upload.wikimedia.org/wikipedia/commons/3/33/Tom_Cruise_by_Gage_Skidmore_2.jpg", 4.2f));
        stars.add(new Star("Brad Pitt", "https://upload.wikimedia.org/wikipedia/commons/4/4c/Brad_Pitt_2019_by_Glenn_Francis.jpg", 4.8f));
        stars.add(new Star("Kate Bosworth", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Kate_Bosworth_%282016%29_%28close-up%29.jpg", 4.0f));
        stars.add(new Star("Michelle Rodriguez", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Michelle_Rodriguez_2010_cropped.jpg/500px-Michelle_Rodriguez_2010_cropped.jpg", 4.6f));
        stars.add(new Star("George Clooney", "https://upload.wikimedia.org/wikipedia/commons/8/8d/George_Clooney_2016.jpg", 4.9f));
    }

    @Override public boolean create(Star o) { return stars.add(o); }
    @Override public boolean update(Star o) {
        for (Star s : stars) {
            if (s.getId() == o.getId()) {
                s.setName(o.getName());
                s.setImg(o.getImg());
                s.setRating(o.getRating());
                return true;
            }
        }
        return false;
    }
    @Override public boolean delete(Star o) { return stars.remove(o); }
    @Override public Star findById(int id) {
        for (Star s : stars) if (s.getId() == id) return s;
        return null;
    }
    @Override public List<Star> findAll() { return stars; }
}
