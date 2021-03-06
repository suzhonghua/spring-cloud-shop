package quick.pager.shop.risk.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import quick.pager.shop.model.Model;

/**
 * 黑名单
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@TableName("t_black_list")
public class BlackList extends Model {
    private static final long serialVersionUID = 71428320572149224L;
    /**
     * 手机号
     */
    private String phone;
}
