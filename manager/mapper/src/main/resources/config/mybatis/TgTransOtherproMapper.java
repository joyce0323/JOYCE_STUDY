package config.mybatis;

import com.coracle.entity.TgTransOtherpro;
import com.coracle.entity.TgTransOtherproExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TgTransOtherproMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    long countByExample(TgTransOtherproExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int deleteByExample(TgTransOtherproExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int insert(TgTransOtherpro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int insertSelective(TgTransOtherpro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    List<TgTransOtherpro> selectByExample(TgTransOtherproExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    TgTransOtherpro selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") TgTransOtherpro record, @Param("example") TgTransOtherproExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int updateByExample(@Param("record") TgTransOtherpro record, @Param("example") TgTransOtherproExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int updateByPrimaryKeySelective(TgTransOtherpro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tg_trans_otherpro
     *
     * @mbg.generated Thu Dec 13 15:22:52 CST 2018
     */
    int updateByPrimaryKey(TgTransOtherpro record);
}