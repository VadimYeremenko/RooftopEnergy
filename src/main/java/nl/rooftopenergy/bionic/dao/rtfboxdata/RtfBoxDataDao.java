package nl.rooftopenergy.bionic.dao.rtfboxdata;


import nl.rooftopenergy.bionic.entity.RtfBox;
import nl.rooftopenergy.bionic.entity.RtfBoxData;

import java.util.List;

public interface RtfBoxDataDao {
    /**
     * Returns list of boxes using id number;
     * @param rtfBox comparing object
     * @return list of boxes;
     */
    public List<RtfBoxData> findByRtfBoxId(RtfBox rtfBox);
}