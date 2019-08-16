package com.yixin.edu.model.media.response;

import com.yixin.edu.common.model.response.ResponseResult;
import com.yixin.edu.common.model.response.ResultCode;
import com.yixin.edu.model.media.MediaFile;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
@NoArgsConstructor
public class MediaFileResult extends ResponseResult {
    MediaFile mediaFile;
    public MediaFileResult(ResultCode resultCode, MediaFile mediaFile) {
        super(resultCode);
        this.mediaFile = mediaFile;
    }
}
