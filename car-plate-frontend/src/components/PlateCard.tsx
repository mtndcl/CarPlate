import Button from "@mui/material/Button";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";

type PlateCardProps = {
    plateNumber: string;
};

export default function PlateCard({plateNumber}: PlateCardProps) {
    return (
        <Card sx={{width: "25%", height: "25%"}}>
            <CardContent>{plateNumber}
                <ul>

                    <li>daha güzel sürebıldii</li>
                    <li>Ehliyeti kasaptan almış dikkat</li>

                </ul>
            </CardContent>
            <CardActions>
                <Button size="small">Learn More</Button>


            </CardActions>
        </Card>
    );
}
