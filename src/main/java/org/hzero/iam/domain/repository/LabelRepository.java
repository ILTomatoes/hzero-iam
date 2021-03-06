package org.hzero.iam.domain.repository;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.iam.domain.entity.Label;
import org.hzero.mybatis.base.BaseRepository;

import java.util.List;

/**
 * 资源库
 *
 * @author xiaoyu.zhao@hand-china.com 2020-02-25 14:22:16
 */
public interface LabelRepository extends BaseRepository<Label> {

    /**
     * 分页查询标签信息列表
     *
     * @param pageRequest 分页参数
     * @param label 查询条件
     * @return 查询结果
     */
    Page<Label> pageLabelList(PageRequest pageRequest, Label label);

    /**
     * 通过标签名称和层级校验标签唯一性
     *
     * @param label 校验条件
     * @return true 校验通过  false 校验失败
     */
    Boolean validLabelUnique(Label label);

    /**
     * 根据标签类型获取标签列表
     *
     * @param type 标签类型
     * @return 标签
     */
    List<Label> getLabelListByType(String type);

    /**
     * 根据标签编码和标签类型查询
     */
    List<Label> getLabelListByTypeAndNames(String type, String[] labelName);
}
